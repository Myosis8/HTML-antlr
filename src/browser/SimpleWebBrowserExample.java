package browser;

import hello.GrammarLexer;
import hello.GrammarParser;
import hello.ParserBuilder;
import hello.QueryParserLexer;
import hello.QueryParserParser;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import search.DirectoryParser;
import search.KeyNode;
import search.Query;
import search.RelationEdge;
import search.SearchGraph;
import search.TempEdge;

import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserCommandEvent;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserEvent;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserListener;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserNavigationEvent;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserWindowOpeningEvent;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserWindowWillOpenEvent;

public class SimpleWebBrowserExample extends JFrame {
	private static final String PROTOCOL_PREFIX = "file://";
	private static final String FILESEP = java.io.File.separator;
	private static final String SITE_DIRECTORY = System.getProperty("user.dir") + FILESEP + "OS";
	private static final String START_PAGE = PROTOCOL_PREFIX + SITE_DIRECTORY + FILESEP + "Ch1.serge";
	private static final long serialVersionUID = 1L;
	private JWebBrowser webBrowser;
	private String currentString = new String("hello");
	private String resultString;
	private String searchDirectory;
	private JTextField searchField;

	public SimpleWebBrowserExample() throws IOException {
		super();
		setBounds(100, 100, 900, 600);
		Dimension size = new Dimension(430, 100);
		setTitle("Дэнчик, Дэ-э-э-э-э-э-энчик :D");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setMinimumSize(size);
		setLayout(new BorderLayout());
		setBackground(Color.ORANGE);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				delete(currentString + ".parsed.html");
				NativeInterface.close();
			}
		});
		initWebBrowser();
		// Create an additional bar allowing to show/hide the menu bar of the
		// web browser.
		initToolbar();
		validate();
	}

	public void initWebBrowser() {
		JPanel webBrowserPanel = new JPanel(new BorderLayout());
		// webBrowserPanel.setBorder(BorderFactory.createTitledBorder("Native Web Browser component"));
		webBrowser = new JWebBrowser();
		webBrowser.setButtonBarVisible(false);
		webBrowser.setBackground(Color.cyan);
		webBrowser.addWebBrowserListener(new WebBrowserListener() {

			public void windowWillOpen(WebBrowserWindowWillOpenEvent arg0) {
				// TODO Auto-generated method stub

			}

			public void windowOpening(WebBrowserWindowOpeningEvent arg0) {
				// TODO Auto-generated method stub

			}

			public void windowClosing(WebBrowserEvent arg0) {
				// TODO Auto-generated method stub
				// delete(currentString+".parsed.html");
			}

			public void titleChanged(WebBrowserEvent arg0) {
				// TODO Auto-generated method stub

			}

			public void statusChanged(WebBrowserEvent arg0) {
				// TODO Auto-generated method stub

			}

			public void locationChanging(WebBrowserNavigationEvent arg0) {

			}

			public void locationChanged(WebBrowserNavigationEvent arg0) {
				String newLocation = webBrowser.getResourceLocation();
				if (isItMyFile(newLocation)) {
					arg0.consume();
					if (isItMyFile(currentString)) {
						delete(currentString + ".parsed.html");
					}
					currentString = newLocation.substring(newLocation.indexOf("://")+3);
					parse();
					write(currentString, resultString);
					SwingUtilities.invokeLater(new Runnable() {
						public void run() {
							webBrowser.navigate(PROTOCOL_PREFIX + currentString
									+ ".parsed.html");
						}
					});

//					 webBrowser.navigate(currentString+".parsed.html");
				} else {
					arg0.consume();
				}
			}

			public void locationChangeCanceled(WebBrowserNavigationEvent arg0) {
				// TODO Auto-generated method stub

			}

			public void loadingProgressChanged(WebBrowserEvent arg0) {
				// TODO Auto-generated method stub

			}

			public void commandReceived(WebBrowserCommandEvent arg0) {
				// TODO Auto-generated method stub

			}
		});
		webBrowser.navigate(START_PAGE);
		webBrowser.setBarsVisible(true);
		webBrowserPanel.add(webBrowser, BorderLayout.CENTER);

		initSearchStuff(webBrowserPanel);

	}

	private void initSearchStuff(JPanel webBrowserPanel) {
		searchField = new JTextField("");
		webBrowserPanel.add(searchField, BorderLayout.PAGE_START);
		JButton setSearchDirectory = new JButton("SetSearchDirectory");
		Panel buttons = new Panel();
		buttons.add(setSearchDirectory);
		
		JButton search = new JButton("Поиск");
		search.setBackground(Color.WHITE);
		
		buttons.add(search);
		
		webBrowserPanel.add(buttons, BorderLayout.PAGE_END);
		add(webBrowserPanel, BorderLayout.CENTER);

		setSearchDirectory.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				searchDirectory = searchField.getText();

				SearchGraph.clearSearchGraph();
				SearchGraph.getSearchGraph();
				ArrayList<TempEdge> edges = new ArrayList<TempEdge>();
				try {
					edges = directoryParse(edges);
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}

				for (TempEdge temp : edges) {
					KeyNode node1 = SearchGraph.getVertexByID(temp.getSource());
					KeyNode node2 = SearchGraph.getVertexByID(temp.getTarget());
					SearchGraph.addEdgeToSearchGraph(node1, node2,
							new RelationEdge(node1, node2, temp.getName()));
				}
				SearchGraph.print();
			}
		});

		search.addMouseListener(new MouseAdapter() {

			public void mousePressed(MouseEvent e) {
				String queryText = searchField.getText();
				CharStream stream = null;
				stream = new ANTLRStringStream(queryText);
				QueryParserLexer lexer = new QueryParserLexer(stream);
				TokenStream tokenStream = new CommonTokenStream(lexer);
				QueryParserParser parser = new QueryParserParser(tokenStream);
				Query query = null;
				try {
					query = parser.page();
				} catch (RecognitionException e1) {
					e1.printStackTrace();
				}
				write(searchDirectory + FILESEP + "SearchResult.serge", search(query));
				currentString = searchDirectory + FILESEP + "SearchResult.serge";
				webBrowser.navigate(PROTOCOL_PREFIX + currentString + ".parsed.html");
			}
		});
	}

	public void initToolbar() {
		// JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 4,
		// 4));
		JCheckBox menuBarCheckBox = new JCheckBox("Menu Bar", webBrowser
				.isMenuBarVisible());
		menuBarCheckBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				webBrowser
						.setMenuBarVisible(e.getStateChange() == ItemEvent.SELECTED);
			}
		});
		// buttonPanel.add(menuBarCheckBox);
		// add(buttonPanel, BorderLayout.SOUTH);
	}

	public void parse() {
		CharStream stream = null;
		try {
			stream = new ANTLRFileStream(currentString);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		GrammarLexer lexer = new GrammarLexer(stream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		GrammarParser parser = new GrammarParser(tokenStream);
		StringBuilder result = null;
		try {
			result = parser.page();
		} catch (RecognitionException e1) {
			e1.printStackTrace();
		}
		resultString = result.toString();
		// System.out.println(resultString);
	}

	private void write(String fileName, String text) {
		try {
			PrintWriter out = new PrintWriter(new File(fileName
					+ ".parsed.html").getAbsoluteFile());
			try {
				out.print(text);
			} finally {
				out.close();
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	private void delete(String fileName) {
		File toDelete = new File(fileName);
		toDelete.delete();
	}

	public boolean isItMyFile(String str) {
		return str.endsWith(".serge");
	}

	private ArrayList<TempEdge> directoryParse(ArrayList<TempEdge> edges)
			throws FileNotFoundException {
		DirectoryParser dir = new DirectoryParser(searchDirectory, edges);
		dir.run();
		return dir.getEdges();
	}

	private String search(Query query) {
		String begin = null;
		String end = null;
		begin = "<html>\r\n" + "	<head>\r\n" + "		<title>\r\n"
				+ "		Search Result\r\n" + "		</title>" + "	</head>"
				+ "	<body> " + "		<p align=\"center\"> Search Result </p>";

		end = "</body> </html>";
		ParserBuilder builder = new ParserBuilder();
		builder.append(begin);
		boolean find = false;
		switch (query.getType()) {
		case 1: {
			// find every key node
			Set<KeyNode> nodes = SearchGraph.getSearchGraph().vertexSet();
			for (KeyNode node : nodes) {
				node.getContent(builder);
			}
			find = true;
			break;
		}
		case 2: {
			// find every relation
			Set<RelationEdge> edges = SearchGraph.getSearchGraph().edgeSet();
			for (RelationEdge edge : edges) {
				edge.getContent(builder);
			}
			find = true;
			break;
		}
		case 3: {
			// find mass of a Planet
			Set<RelationEdge> edges = SearchGraph.getSearchGraph().edgeSet();
			for (RelationEdge edge : edges) {
				if (edge.getSource().equals(
						SearchGraph.getVertexByID(query.getSource()))
						&& edge.getRelationName().equals("mass")) {
					SearchGraph.getVertexByID(query.getSource()).getContent(
							builder);
					SearchGraph.getVertexByID(edge.getTarget().toString())
							.getContent(builder);
					find = true;
					break;
				}
			}
			break;
		}

		case 4: {
			// find subclasses of a Planet
			Set<RelationEdge> edges = SearchGraph.getSearchGraph().edgeSet();
			for (RelationEdge edge : edges) {
				if (edge.getSource().equals(
						SearchGraph.getVertexByID(query.getSource()))
						&& edge.getRelationName().equals("subclass")) {
					// SearchGraph.getVertexByID(query.getSource()).getContent(builder);
					SearchGraph.getVertexByID(edge.getTarget().toString())
							.getContent(builder);
					find = true;

				}
			}
			break;
		}

		case 5: {
			// find type of a Planet
			Set<RelationEdge> edges = SearchGraph.getSearchGraph().edgeSet();
			for (RelationEdge edge : edges) {
				if (edge.getTarget().equals(
						SearchGraph.getVertexByID(query.getTarget()))
						&& edge.getRelationName().equals("inclusion")) {
					// SearchGraph.getVertexByID(query.getSource()).getContent(builder);
					SearchGraph.getVertexByID(edge.getSource().toString())
							.getContent(builder);
					find = true;
					break;
				}
			}
			break;
		}
		case 6: {
			find = false;
			break;
		}
		}
		if (!find) {
			builder.append("Not found");
		}
		builder.append(end);
		System.out.println(builder.getBuilder().toString());
		return builder.getBuilder().toString();
	}
}

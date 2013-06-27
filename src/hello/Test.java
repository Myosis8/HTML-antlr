package hello;


import java.io.IOException;


import javax.swing.SwingUtilities;

import org.antlr.runtime.RecognitionException;

import browser.*;
import chrriis.dj.nativeswing.swtimpl.NativeInterface;

public class Test {

	public static void main(String[] args) throws RecognitionException, IOException {			
		NativeInterface.open();    
		//UIUtils.setPreferredLookAndFeel();   
		    
		    /*SwingUtilities.invokeLater(new Runnable() {   
		      public void run() {   
		        try{
		    	JFrame frame = new JFrame("Web Browser");   
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
		        frame.getContentPane().add(new SimpleWebBrowserExample(), BorderLayout.CENTER);   
		        frame.setSize(800, 600);   
		        frame.setLocationByPlatform(true);   
		        frame.setVisible(true);		       
		        } catch (IOException e) {
		        	 
		            e.printStackTrace();
		           } 
		      }   
		    });  */
		
		 SwingUtilities.invokeLater(new Runnable() {   
		      public void run() {   
		    	 try {
					@SuppressWarnings("unused")
					SimpleWebBrowserExample browser = new SimpleWebBrowserExample();
					/*KeyNode node1 = new KeyText("Hello", "How it's gonna be");
					KeyNode node2 = new KeyText("Everything going to be ok", "Everything going to be ok");
					SearchGraph.addVertexToSearchGraph(node1);
					SearchGraph.addVertexToSearchGraph(node2);
					SearchGraph.addEdgeToSearchGraph(node1, node2, new RelationEdge(node1, node2, "Prediciton"));					
					SearchGraph.print();*/
				} catch (IOException e) {
		
					e.printStackTrace();
				} 
		      }   
		    });   
		    NativeInterface.runEventPump();   
		  
	}	    
}

package search;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import hello.GrammarLexer;
import hello.GrammarParser;
import hello.SearchParserLexer;
import hello.SearchParserParser;

public class DirectoryParser {
    public File rootDirectory;
    private ArrayList<TempEdge> edges;
    
    public ArrayList<TempEdge> getEdges() {
		return edges;
	}

	public DirectoryParser(String rootDirectoryPath, ArrayList<TempEdge> edges) throws FileNotFoundException{
        
        File file = new File(rootDirectoryPath);
        if (file.exists() && file.isDirectory()){
            rootDirectory = file;
            this.edges = edges;
        	}
        else
            throw new FileNotFoundException();
    }

    public void run(){
        scanDirectory(rootDirectory);
    }

    private boolean isItMyFile (String str){
		return str.endsWith(".serge");
	} 
    
    void scanDirectory(File directory){
        File[] files = directory.listFiles();
        if (files != null){
            for (File f : files){
                final String path = f.getAbsolutePath();
                if(isItMyFile(path)){                	
                	CharStream stream=null;
            		try {
            			 stream = new ANTLRFileStream(path);
            		} catch (IOException e1) {
            			e1.printStackTrace();
            		}
            		SearchParserLexer lexer = new SearchParserLexer(stream);
            		TokenStream tokenStream = new CommonTokenStream(lexer);
            		SearchParserParser parser = new SearchParserParser(tokenStream);
            		ArrayList<TempEdge> thisFileEdges = new ArrayList<TempEdge>();
            		try {
            			thisFileEdges = parser.page();
            		} catch (RecognitionException e1) {
            			e1.printStackTrace();
            		}
            		if(thisFileEdges != null) {
            			edges.addAll(thisFileEdges);
            		}
            			
                }
                if (f.isDirectory() && !f.isHidden()){
                    scanDirectory(f);
                }
            }
        }
    }
}

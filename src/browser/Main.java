package browser;

import browser.SimpleWebBrowserExample;
import java.util.*;

import chrriis.dj.nativeswing.swtimpl.NativeInterface;   
import chrriis.dj.nativeswing.NativeSwing;   
import javax.swing.SwingUtilities;

import java.io.*;

class Main {
	private static final String APP_NAME = "Serge's browser";
	private static File _log;
	private static FileWriter _logWriter;
	
    public static void main(String[] args) {
    	if(args.length < 1 || args[0] != "--no-log") {
    		try {
    			_log = new File("browser.log");
    			if(_log.exists())
    				_log.delete();
    			_logWriter = new FileWriter(_log);
    			log("Application started");
    		}
    		catch(Exception e) {
    			System.out.print("failed to initialize log! Terminating...\n" +
    					"Note: to omit logging, start with --no-log\n");
    			System.exit(-1);
    		}
    	}
    	
        try {
            NativeSwing.initialize();
            NativeInterface.open();

            SwingUtilities.invokeLater(new Runnable() {
              public void run() {
                  try {
                  SimpleWebBrowserExample browser = new SimpleWebBrowserExample();
              }
              catch(Exception e) {
                  
              }
              }
            });
            NativeInterface.runEventPump();
        }
        catch(Exception e) {
            try {
				log("Exception caught: " + e.getLocalizedMessage());
				e.printStackTrace();
			} catch (IOException e1) {
				System.out.print("Canot write to the log file: " + e1.getLocalizedMessage() + "\n");
				e1.printStackTrace();
			}
        }
    }

	protected static void log(String str) throws IOException {
		if(_logWriter != null) {
			_logWriter.write((new Date()).toString() + "["+APP_NAME+"]"+": " + str + "\n");
			_logWriter.flush();
		}
	}
}

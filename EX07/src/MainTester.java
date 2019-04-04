import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainTester {

	public static void main(String[] args) {
		
		JUnitCore junit = new JUnitCore();
        junit.addListener(new TextListener(System.out));
		
		// Checks how many options were input and exits program if given invalid input.
//		if ( ( args.length != 2 ) && ( !args[0].equals("-h") ) ) {
//			
//			System.out.println("INVALID INPUT: \n"
//					+ "1. Enter an option and an input object, or a file name. \n"
//					+ "2. Enter -h to see available options.");
//			System.exit(0);
//			
//		} // Ends if
		
		// Checks which option is input
		switch( args[0] ) { 
		
            case "-h": 
                System.out.println("AVAILABLE OPTIONS \n"
            		+ "-h: Displays list of available options (like this). \n"
            		+ "-n: Use when the following option is a test object. \n"
            		+ "-f: Use when the following option is a file with the test object \n"
        		); 
                break;
                
            case "-n": 
                
                //junit.run(WhateverTheFuckClassItIs.class);
                
                break; 
                
            case "-f": 
            	
                runFromFile( args[1] );
                break; 
                
            default: 
                System.out.println("INVALID INPUT"); 
                
        } // Ends switch
		
		
	} // Ends main
	
	public static void runFromFile( String fileName ) {
		
		try {
			
			File file = new File( fileName );
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			String line;
			
			while ( (line = bufferedReader.readLine() ) != null) {
				//junit.run( WhateverTheFuckClassItIs.class );
			}
			
			fileReader.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		} // Ends try catch
		
	} // Ends runFromFile()
	
} // Ends class
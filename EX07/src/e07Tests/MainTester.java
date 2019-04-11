// Sean Decker: Edited file for EX07 on 4/9
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainTester {
	
	public static void main(String[] args) {
		
		EdgeFieldTest fieldTest = new EdgeFieldTest();
		EdgeTableTest tableTest = new EdgeTableTest();
		
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
                
				try { 
					fieldTest.setUp( args[1] );
					System.out.println("EdgeField Tests Passed!");
					tableTest.setUp( args[1] );
					System.out.println("EdgeTable Tests Passed!");
            	} catch (Exception e) {
            		e.printStackTrace();
            	}
				
                break; 
                
            case "-f": 
            	
            	try { 
            		runFromFile( args[1] );	
            	} catch (Exception e) {
            		e.printStackTrace();
            	}
            	
                break; 
                
            default: 
                System.out.println("INVALID INPUT"); 
                
        } // Ends switch
		
	} // Ends main
	
	public static void runFromFile( String fileName ) throws Exception {
		
		EdgeFieldTest fieldTest = new EdgeFieldTest();
		EdgeTableTest tableTest = new EdgeTableTest();
		
		try {
			
			File file = new File( fileName );
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			String line;
			
			while ( (line = bufferedReader.readLine() ) != null) {
				
				fieldTest.setUp(line);
				System.out.println("EdgeField Tests Passed!");
				tableTest.setUp(line);
				System.out.println("EdgeTable Tests Passed!");
				
			}
			
			fileReader.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		} // Ends try catch
		
	} // Ends runFromFile()
	
} // Ends class

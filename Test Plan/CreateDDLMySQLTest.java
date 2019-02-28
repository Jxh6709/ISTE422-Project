// Kevin Gleason
// 
// List of items that should be tested

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CreateDDLMySQLTest {
    CreateDDLMySQL testOBJ;

    // To test CreateDDLMySQL, EdgeTable and EdgeField need to be working?
    @Before
    public void setUp() throws Exception {
        testOBJ = new CreateDDLMySQL();
        runner();
    }

    public void runner() {
        testCreateDDL();
        testConvertStrBooleanToInt();
        testGenerateDatabaseName();
        testGetDatabaseName();
        testGetProductName();
        testGetSQLString();

    }

    // Majority of the functionality looks to be in here as it creates the database and tables
    @Test
    public void testCreateDDL() {
         assertEquals("The table should be created from the given data",true,testObj.createDDL());
    }

    @Test
    public void testConvertStrBooleanToInt(){
         assertEquals("We should retrieve 1 for true",1,testObj.convertStrBooleanToInt("true"));
         assertEquals("We should retrieve 0 for false",0,testObj.convertStrBooleanToInt("false"));
    }

    @Test
    public void testGenerateDatabaseName() {
         assertEquals("Returns the name of the database entered. Please enter testDb.","testDb",testObj.generateDatabaseName());
    }

    @Test
    public void testGetDatabaseName() {
        assertEquals("Should return the name of the db entered in testGenerateDatabaseName.","testDb",testObj.getDatabaseName());
    }

    @Test
    public void testGetProductName() {
        assertEquals("Returns MySQL","MySQL",testObj.getProductName());
    }

    @Test
    public void testGetSQLString() {
         assertEquals("Returns the result of createDDL",true,testObj.getSQLString());
    }

} // end of class
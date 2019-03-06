// Kevin Gleason
// Joshua Haber
// List of items that should be tested

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CreateDDLMySQLTest {
    CreateDDLMySQL testObj;

    // To test CreateDDLMySQL, EdgeTable and EdgeField need to be working?
    @Before
    public void setUp() throws Exception {
        EdgeTable[] inputTables = new EdgeTable[]{new EdgeTable("1|STUDENT")};
        EdgeField[] inputFields = new EdgeField[]{new EdgeField("1|id")};
        testObj = new CreateDDLMySQL(inputTables, inputFields);
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
         assertEquals("The table should be created from the given data",testObj.createDDL());
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
         assertEquals("Returns the result of createDDL","CREATE DATABSE testDb;\r\nUSE testDb;\r\nCREATE TABLE STUDENT(\n\tid VARCHAR(1)\r\n);",testObj.getSQLString());
    }

} // end of class

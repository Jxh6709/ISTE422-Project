// Kevin Gleason
// 
// List of items that should be tested

// Need imports

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

    }

    @Test
    public void testConvertStrBooleanToInt(){

    }

    @Test
    public void testGenerateDatabaseName() {

    }

    @Test
    public void testGetDatabaseName() {

    }

    @Test
    public void testGetProductName() {

    }

    @Test
    public void testGetSQLString() {

    }

} // end of class
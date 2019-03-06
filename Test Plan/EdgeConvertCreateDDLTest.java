// Kevin Gleason
// Romero
// 
// List of items that should be tested

// Need imports

public class EdgeConvertCreateDDLTest {
    EdgeConvertCreateDDL testObj;

    @Before
    public void setUp() throws Exception {
        testObj = new EdgeConvertCreateDDL(new EdgeTable[]{new EdgeTable("1|Student")}, new EdgeFields[]{new EdgeField("1|id")});
        runner();
    }

    public void runner() {
        testInitialize();
        testGetField();
        testGetTable();
    }

    @Test
    public void testInitialize() {
        testObj.initialize();
        assertEquals("The first table was initialized with a name of 'Student'", "Student", testObj.getTable(0).getName());
    }

    @Test
    public void testGetTable() {
        assertEquals("Returns that the first table's name is 'Student'", "Student", testObj.getTable(0).getName());
    }

    @Test
    public void testGetField() {
        assertEquals("Returns that the first column's name is 'id;", "id", testObj.getField(0).getName());
    }

} // end of class
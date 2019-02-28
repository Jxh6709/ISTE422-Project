// Kevin Gleason
// 
// List of items that should be tested

// Need imports

public class EdgeConvertCreateDDLTest {
    EdgeConvertCreateDDL testObj;

    @Before
    public void setUp() throws Exception {
        testObj = new EdgeConvertCreateDDL(){
        // code completion added these, not sure if they would be needed for testing
            @Override
            public String getSQLString() {
                return null;
            }
        
            @Override
            public String getProductName() {
                return null;
            }
        
            @Override
            public String getDatabaseName() {
                return null;
            }
        
            @Override
            public void createDDL() {
                
            }
        };
        runner();
    }

    public void runner() {

    }

    @Test
    public void testInitialize() {

    }

    @Test
    public void testGetTable() {

    }

    @Test
    public void testGetField() {

    }

} // end of class
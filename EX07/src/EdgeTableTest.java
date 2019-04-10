// Sean Decker: Edited for EX07 on 4/9
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EdgeTableTest
{
    EdgeTable testObj;
    EdgeTable testObj2;

    private int id;
    private String name;

    @Before
    public void setUp(String i) throws Exception {
		
		testObj = new EdgeTable(i);
		
    	this.id = Integer.valueOf(i.split("\\|")[0]);
        this.name = i.split("\\|")[1];
   
        runner(id,name);
        
    } // Ends constructor
    
//    @Before
//    public void setUp() throws Exception
//    {
//        testObj = new EdgeTable("1|id");
//        runner();
//    }

    public void runner(int id, String name)
    {
        testGetNumFigure(id);
        testGetName(name);
       // testAddRelatedTables();
        testGetRelatedTablesArray();
       // testSetRelatedFields(); 
        testGetRelatedFieldsArray();
       // testAddNativeField();
        testGetNativeFieldsArray();
       // testMoveFieldUp();
       // testMoveFieldDown();
       // testMakeArrays();
       // testToString();
    }

    @Test
    public void testGetNumFigure(int id)
    {
        assertEquals("numFigure was initialized to " + this.id + " so it should be " + this.id, id, testObj.getNumFigure());
    }

    @Test
    public void testGetName(String name)
    {
        assertEquals("name was initialized to " + this.name, name, testObj.getName());
    }

   // @Test
   // public void testAddRelatedTables()
  //  {
//	testObj2.addRelatedTable(1);
//	testObj2.makeArrays();
     //   assertEquals("Adds a value to the allRelatedTable", 1, testObj2.getRelatedTablesArray().length);
   // }

    @Test
    public void testGetRelatedTablesArray()
    {
        assertEquals("returns nothing since the makeArray has yet to be called", null, testObj.getRelatedTablesArray());
    }

   // @Test
   // public void testSetRelatedFields()
   // {
     //   assertEquals("adds [3,5] to the related fields array", true, testObj.setRelatedField());
   // }
    
    @Test
    public void testGetRelatedFieldsArray()
    {
        assertEquals("returns nothing since the makeArray has yet to be called", null, testObj.getRelatedFieldsArray());
    }

   // @Test
   // public void testAddNativeField()
   // {
   //     assertEquals("Adds a value to alNativeFields", true, testObj.addNativeField(6));
   // }

    @Test
    public void testGetNativeFieldsArray()
    {
        assertEquals("returns nothing since the makeArray has yet to be called", null, testObj.getNativeFieldsArray());
    }

   // @Test
   // public void testMoveFieldUp()
   // {
   //     assertEquals("Moves the field closer to the start of the list", true, testObj.moveFieldUp());
   // }

   // @Test
   // public void testMoveFieldDown()
   // {
   //     assertEquals("Moves the field to the bottom of the list", true, testObj.moveFieldDown());
   // }

   // @Test
   // public void testMakeArrays()
   // {
   //     assertEquals("Converts the ArrayLists into nativeFields and relatedTables", true, testObj.makeArrays());
   // }

   // @Test
   // public void testToString()
   // {
   //     assertEquals("The full table in a string", "Table: 1 Tablename: id NativeFields: 6 RelatedTables: 2 RelatedFields: 3|5", testObj.toString());
   // }

}

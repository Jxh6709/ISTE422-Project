// Joshua D. Haber

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EdgeTableTest
{
    EdgeTable testObj;
    EdgeTable testObj2;

    @Before
    public void setUp() throws Exception
    {
        testObj = new EdgeTable("1|id");
        runner();
    }

    public void runner()
    {
        testGetNumFigure();
        testGetName();
        testAddRelatedTables();
        testGetRelatedTablesArray();
        testSetRelatedFields(); 
        testGetRelatedFieldsArray();
        testAddNativeField();
        testGetNativeFieldsArray();
        testMoveFieldUp();
        testMoveFieldDown();
       
        testToString();
    }

    @Test
    public void testGetNumFigure()
    {
        assertEquals("numFigure was initialized to 1 so it should be 1", 1, testObj.getNumFigure());
    }

    @Test
    public void testGetName()
    {
        assertEquals("name was initialized to id", "id", testObj.getName());
    }

      @Test
      public void testAddRelatedTables()
      {
	testObj2.makeArrays();
	testObj2.addRelatedTable(1);
        assertEquals("Adds a value to the allRelatedTable", 1, testObj2.getRelatedTablesArray().length);
      }

    @Test
    public void testGetRelatedTablesArray()
    {
        assertEquals("returns nothing since the makeArray has yet to be called", null, testObj.getRelatedTablesArray());
    }

    @Test
    public void testSetRelatedFields()
    {
	testObj2.makeArrays();
	testObj2.setRelatedField(3,5);	
       assertEquals("adds [3,5] to the related fields array", "[3,5]", testObj.getRelatedFieldsArray());
    }
    
    @Test
    public void testGetRelatedFieldsArray()
    {
        assertEquals("returns nothing since the makeArray has yet to be called", null, testObj.getRelatedFieldsArray());
    }

    @Test
    public void testAddNativeField()
    {
	testObj.addNativeField(6);
        assertEquals("Adds a value to alNativeFields", "[6]", testObj.getNativeFieldsArray());
    }

    @Test
    public void testGetNativeFieldsArray()
    {
        assertEquals("returns nothing since the makeArray has yet to be called", null, testObj.getNativeFieldsArray());
    }

   @Test
   public void testMoveFieldUp()
   {
	testObj.makeArrays();
	testObj.moveFieldUp(1);
        assertEquals("Moves the field closer to the start of the list", null, testObj.getRelatedFieldsArray());
   }

   @Test
   public void testMoveFieldDown()
   {
	testObj.makeArrays();
	testObj.moveFieldDown(1);
        assertEquals("Moves the field closer to the end of the list", null, testObj.getRelatedFieldsArray());
   }

   @Test
   public void testToString()
   {
	String s = testObj.toString();
       assertEquals("The full table in a string", true, testObj.toString().length() > 0);
   }

}

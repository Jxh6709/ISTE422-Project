package src;// Joshua D. Haber

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EdgeTableTest
{
    EdgeTable testObj;
    EdgeTable testObj2;

    @Before
    public void setUp(String i) throws Exception
    {
        testObj = new EdgeTable(i);

        int id = Integer.valueOf(i.split("|")[0]);
        String name = i.split("|")[1];

        runner(id, name);
    }

    public void runner(int id, String name)
    {
        testGetNumFigure(id);
        testGetName(name);
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
    public void testGetNumFigure(int id)
    {
        assertEquals("numFigure was initialized to 1 so it should be 1", id, testObj.getNumFigure());
    }

    @Test
    public void testGetName(String e)
    {
        assertEquals("name was initialized to id", e, testObj.getName());
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

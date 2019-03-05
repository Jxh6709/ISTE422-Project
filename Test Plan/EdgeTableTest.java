// Joshua D. Haber

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EdgeTableTest
{
    EdgeField testObj;

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
        testMakeArrays();
        testToString();
    }

    @Test
    public void testGetNumFigure()
    {
        assertEquals("numFigure was initialized to 1 so it should be 1", 1, testObj.getNumConnector());
    }

    @Test
    public void testGetName()
    {
        assertEquals("name was initialized to id", "id", testObj.getName());
    }

    @Test
    public void testAddRelatedTables()
    {
        assertEquals("Adds a value to the alRelatedTable", true, testObj.addRelatedTables(2));
    }

    @Test
    public void testGetRelatedTablesArray()
    {
        testObj.setTableID(1);
        assertEquals("returns nothing since the makeArray has yet to be called", [], testObj.getRelatedTablesArray());
    }

    @Test
    public void testSetRelatedFields()
    {
        testObj.setTableBound(1);
        assertEquals("adds [3,5] to the related fields array", true, testObj.setRelatedFields());
    }
    
    @Test
    public void testGetRelatedFieldsArray()
    {
        assertEquals("returns nothing since the makeArray has yet to be called", [], testObj.getRelatedFieldsArray());
    }

    @Test
    public void testAddNativeField()
    {
        assertEquals("Adds a value to alNativeFields", true, testObj.addNativeField(6));
    }

    @Test
    public void testGetNativeFieldsArray()
    {
        testObj.setFileBound(1);
        assertEquals("returns nothing since the makeArray has yet to be called", [], testObj.getNativeFieldsArray());
    }

    @Test
    public void testMoveFieldUp()
    {
        assertEquals("Moves the field closer to the start of the list", true, testObj.moveFieldUp());
    }

    @Test
    public void testMoveFieldDown()
    {
        testObj.setDisallowNull(true);
        assertEquals("Moves the field to the bottom of the list", true, testObj.moveFieldDown());
    }

    @Test
    public void testMakeArrays()
    {
        assertEquals("Converts the ArrayLists into nativeFields and relatedTables", true, testObj.makeArrays());
    }

    @Test
    public void testToString()
    {
        testObj.setIsPrimaryKey(true);
        assertEquals("The full table in a string", "Table: 1 Tablename: id NativeFields: 6 RelatedTables: 2 RelatedFields: 3|5", testObj.toString());
    }

}
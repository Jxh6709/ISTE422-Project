// Lorenzo Romero
// Sean Decker - Updated 3/6:
// Currently, non of the get functions work, as the set
// finctions seem to be taking priority and running
// first

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EdgeFieldTest
{
    EdgeField testObj;

    @Before
    public void setUp() throws Exception
    {
        testObj = new EdgeField("1|name");
        runner();
    }

    public void runner()
    {
        testGetNumFigure();
        testGetName();
        testGetTableID();
        testSetTableID();
        testGetTableBound();
        testSetTableBound();
        testGetFieldBound();
        testSetFieldBound();
        testGetDisallowNull();
        testSetDisallowNull();
        testGetIsPrimaryKey();
        testSetIsPrimaryKey();
        testGetDefaultValue();
        testSetDefaultValue();
        testGetVarcharValue();
        testSetVarcharValue();
        testGetDataType();
        testSetDataType();
        testGetStrDataType();
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
        assertEquals("name was initialized to name", "name", testObj.getName());
    }

    @Test
    public void testGetTableID()
    {
      System.out.println(testObj.getTableID());
      assertEquals("tableID was initialized to 0", 0, testObj.getTableID());
    }

    @Test
    public void testSetTableID()
    {
        testObj.setTableID(1);
        assertEquals("tableID should be what you set it to", 1, testObj.getTableID());
    }

    @Test
    public void testGetTableBound()
    {
        assertEquals("tableBound was initialized to 0", 0, testObj.getTableBound());
    }

    @Test
    public void testSetTableBound()
    {
        testObj.setTableBound(1);
        assertEquals("tableBound should be what you set it to", 1, testObj.getTableBound());
    }

    @Test
    public void testGetFieldBound()
    {
	assertEquals("fieldBound was initialized to 0", 0, testObj.getFieldBound());
    }

    @Test
    public void testSetFieldBound()
    {
        testObj.setFieldBound(1);
        assertEquals("fieldBound should be what you set it to", 1, testObj.getFieldBound());
    }

    @Test
    public void testGetDisallowNull()
    {
        assertEquals("disallowNull was initialized to false", false, testObj.getDisallowNull());
    }

    @Test
    public void testSetDisallowNull()
    {
        testObj.setDisallowNull(true);
        assertEquals("disallowNull should be what you set it to", true, testObj.getDisallowNull());
    }

    @Test
    public void testGetIsPrimaryKey()
    {
        assertEquals("isPrimaryKey was initialized to false", false, testObj.getIsPrimaryKey());
    }

    @Test
    public void testSetIsPrimaryKey()
    {
        testObj.setIsPrimaryKey(true);
        assertEquals("isPrimaryKey should be what you set it to", true, testObj.getIsPrimaryKey());
    }

    @Test
    public void testGetDefaultValue()
    {
        assertEquals("defaultValue was initialized to ''", "", testObj.getDefaultValue());
    }

    @Test
    public void testSetDefaultValue()
    {
        testObj.setDefaultValue("test");
        assertEquals("defaultValue should be what you set it to", "test", testObj.getDefaultValue());
    }

    @Test
    public void testGetVarcharValue()
    {
        assertEquals("varcharValue was initialized to " + EdgeField.VARCHAR_DEFAULT_LENGTH,
                EdgeField.VARCHAR_DEFAULT_LENGTH,
                testObj.getVarcharValue());
    }

    @Test
    public void testSetVarcharValue()
    {
        testObj.setVarcharValue(1);
        assertEquals("varcharValue should be what you set it to", 1, testObj.getVarcharValue());
    }

    @Test
    public void testGetDataType()
    {
        assertEquals("dataType was initialized to 0", 0, testObj.getDataType());
    }

    @Test
    public void testSetDataType()
    {
        testObj.setDataType(1);
        assertEquals("dataType should be what you set it to", 1, testObj.getDataType());
    }

    @Test
    public void testGetStrDataType()
    {
        assertEquals("strDataType was initialized to ['Varchar', 'Boolean', 'Integer', 'Double']",
                new String[]{"Varchar", "Boolean", "Integer", "Double"},
                testObj.getStrDataType());
    }

    @Test
    public void testToString()
    {
        assertEquals("toString should be correct", "1|name|1|1|1|1|1|true|true|test", testObj.toString());
    }
}

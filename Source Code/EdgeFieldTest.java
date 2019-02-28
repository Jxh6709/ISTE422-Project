import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EdgeFieldTest
{
    EdgeField testObj;

    @Before
    public void setUp() throws Exception
    {
        testObj = new EdgeField("1|STUDENT");
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
        testGetFileBound();
        testSetFileBound();
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
        assertEquals("numFigure was initialized to 1 so it should be 1", 1, testObj.getNumConnector());
    }

    @Test
    public void testGetName()
    {
        assertEquals("name was initialized to STUDENT", "STUDENT", testObj.getName());
    }

    @Test
    public void testGetTableID()
    {
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
    public void testGetFileBound()
    {
        assertEquals("fileBound was initialized to 0", 0, testObj.getFileBound());
    }

    @Test
    public void testSetFileBound()
    {
        testObj.setFileBound(1);
        assertEquals("fileBound should be what you set it to", 1, testObj.getFileBound());
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
        testObj.setVarcharValue("test");
        assertEquals("varcharValue should be what you set it to", "test", testObj.getVarcharValue());
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
                {"Varchar", "Boolean", "Integer", "Double"},
                testObj.getStrDataType());
    }

    @Test
    public void testToString()
    {
        assertEquals("toString should be correct", "1|STUDENT|1|1|1|true|true|test|test|1", testObj.toString());
    }
}
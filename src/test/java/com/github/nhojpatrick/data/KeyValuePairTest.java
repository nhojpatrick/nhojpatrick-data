/*
 * Copyright (c) 2015 https://github.com/nhojpatrick
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the
 * Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.github.nhojpatrick.data;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNull;
import static junit.framework.Assert.assertTrue;

import org.testng.annotations.Test;

/**
 * Key Value Pair tests.
 * 
 * @author nhojpatrick
 */
public class KeyValuePairTest {

    private KeyValuePair<String, Boolean> STR_BOO_PLASIBO_FALSE = new KeyValuePair<String, Boolean>("plasibo", false);

    private KeyValuePair<String, Boolean> STR_BOO_PLASIBO_NULL = new KeyValuePair<String, Boolean>("plasibo", null);

    private KeyValuePair<String, Boolean> STR_BOO_PLASIBO_TRUE = new KeyValuePair<String, Boolean>("plasibo", true);

    private KeyValuePair<String, Integer> STR_INT_PLASIBO_MAX = new KeyValuePair<String, Integer>("plasibo",
            Integer.MAX_VALUE);

    private KeyValuePair<String, Integer> STR_INT_PLASIBO_MIN = new KeyValuePair<String, Integer>("plasibo",
            Integer.MIN_VALUE);

    private KeyValuePair<String, Integer> STR_INT_PLASIBO_NULL = new KeyValuePair<String, Integer>("plasibo", null);

    private KeyValuePair<String, Integer> STR_INT_PLASIBO_ZERO = new KeyValuePair<String, Integer>("plasibo", 0);

    private KeyValuePair<String, String> STR_STR_EMPTY_EMPTY = new KeyValuePair<String, String>("", "");

    private KeyValuePair<String, String> STR_STR_EMPTY_NULL = new KeyValuePair<String, String>("", null);

    private KeyValuePair<String, String> STR_STR_EMPTY_PLASIBO = new KeyValuePair<String, String>("", "plasibo");

    private KeyValuePair<String, String> STR_STR_NULL_EMPTY = new KeyValuePair<String, String>(null, "");

    private KeyValuePair<String, String> STR_STR_NULL_NULL = new KeyValuePair<String, String>(null, null);

    private KeyValuePair<String, String> STR_STR_NULL_PLASIBO = new KeyValuePair<String, String>(null, "plasibo");

    private KeyValuePair<String, String> STR_STR_PLASIBO_EMPTY = new KeyValuePair<String, String>("plasibo", "");

    private KeyValuePair<String, String> STR_STR_PLASIBO_NULL = new KeyValuePair<String, String>("plasibo", null);

    private KeyValuePair<String, String> STR_STR_PLASIBO_PLASIBO = new KeyValuePair<String, String>("plasibo",
            "plasibo");

    @Test
    public void keyValuePair_constructor_strBoo_plasiboFALSE() {

        final KeyValuePair<String, Boolean> keyValuePair = new KeyValuePair<String, Boolean>("plasibo", Boolean.FALSE);
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        final String key = keyValuePair.getKey();
        assertEquals("Unexpected KeyValuePair.getKey()", "plasibo", key);

        final Boolean value = keyValuePair.getValue();
        assertEquals("Unexpected KeyValuePair.getValue()", Boolean.FALSE, value);
    }

    @Test
    public void keyValuePair_constructor_strBoo_plasiboNULL() {

        final KeyValuePair<String, Boolean> keyValuePair = new KeyValuePair<String, Boolean>("plasibo", null);
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        final String key = keyValuePair.getKey();
        assertEquals("Unexpected KeyValuePair.getKey()", "plasibo", key);

        final Boolean value = keyValuePair.getValue();
        assertEquals("Unexpected KeyValuePair.getValue()", null, value);
    }

    @Test
    public void keyValuePair_constructor_strBoo_plasiboTRUE() {

        final KeyValuePair<String, Boolean> keyValuePair = new KeyValuePair<String, Boolean>("plasibo", Boolean.TRUE);
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        final String key = keyValuePair.getKey();
        assertEquals("Unexpected KeyValuePair.getKey()", "plasibo", key);

        final Boolean value = keyValuePair.getValue();
        assertEquals("Unexpected KeyValuePair.getValue()", Boolean.TRUE, value);
    }

    @Test
    public void keyValuePair_constructor_strInt_plasiboMAX() {

        final KeyValuePair<String, Integer> keyValuePair = new KeyValuePair<String, Integer>("plasibo",
                Integer.MAX_VALUE);
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        final String key = keyValuePair.getKey();
        assertEquals("Unexpected KeyValuePair.getKey()", "plasibo", key);

        final Integer value = keyValuePair.getValue();
        assertEquals("Unexpected KeyValuePair.getValue()", (Integer) Integer.MAX_VALUE, value);
    }

    @Test
    public void keyValuePair_constructor_strInt_plasiboMIN() {

        final KeyValuePair<String, Integer> keyValuePair = new KeyValuePair<String, Integer>("plasibo",
                Integer.MIN_VALUE);
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        final String key = keyValuePair.getKey();
        assertEquals("Unexpected KeyValuePair.getKey()", "plasibo", key);

        final Integer value = keyValuePair.getValue();
        assertEquals("Unexpected KeyValuePair.getValue()", (Integer) Integer.MIN_VALUE, value);
    }

    @Test
    public void keyValuePair_constructor_strInt_plasiboNULL() {

        final KeyValuePair<String, Integer> keyValuePair = new KeyValuePair<String, Integer>("plasibo", null);
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        final String key = keyValuePair.getKey();
        assertEquals("Unexpected KeyValuePair.getKey()", "plasibo", key);

        final Integer value = keyValuePair.getValue();
        assertEquals("Unexpected KeyValuePair.getValue()", null, value);
    }

    @Test
    public void keyValuePair_constructor_strInt_plasiboZero() {

        final KeyValuePair<String, Integer> keyValuePair = new KeyValuePair<String, Integer>("plasibo", 0);
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        final String key = keyValuePair.getKey();
        assertEquals("Unexpected KeyValuePair.getKey()", "plasibo", key);

        final Integer value = keyValuePair.getValue();
        assertEquals("Unexpected KeyValuePair.getValue()", (Integer) 0, value);
    }

    @Test
    public void keyValuePair_constructor_strStr_emptyEmpty() {

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<String, String>("", "");
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        final String key = keyValuePair.getKey();
        assertEquals("Unexpected KeyValuePair.getKey()", "", key);

        final String value = keyValuePair.getValue();
        assertEquals("Unexpected KeyValuePair.getValue()", "", value);
    }

    @Test
    public void keyValuePair_constructor_strStr_emptyNULL() {

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<String, String>("", null);
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        final String key = keyValuePair.getKey();
        assertEquals("Unexpected KeyValuePair.getKey()", "", key);

        final String value = keyValuePair.getValue();
        assertEquals("Unexpected KeyValuePair.getValue()", null, value);
    }

    @Test
    public void keyValuePair_constructor_strStr_emptyPlasibo() {

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<String, String>("", "plasibo");
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        final String key = keyValuePair.getKey();
        assertEquals("Unexpected KeyValuePair.getKey()", "", key);

        final String value = keyValuePair.getValue();
        assertEquals("Unexpected KeyValuePair.getValue()", "plasibo", value);
    }

    @Test
    public void keyValuePair_constructor_strStr_NULLEmpty() {

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<String, String>(null, "");
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        final String key = keyValuePair.getKey();
        assertEquals("Unexpected KeyValuePair.getKey()", null, key);

        final String value = keyValuePair.getValue();
        assertEquals("Unexpected KeyValuePair.getValue()", "", value);
    }

    @Test
    public void keyValuePair_constructor_strStr_NULLNULL() {

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<String, String>(null, null);
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        final String key = keyValuePair.getKey();
        assertEquals("Unexpected KeyValuePair.getKey()", null, key);

        final String value = keyValuePair.getValue();
        assertEquals("Unexpected KeyValuePair.getValue()", null, value);
    }

    @Test
    public void keyValuePair_constructor_strStr_plasiboEmpty() {

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<String, String>("plasibo", "");
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        final String key = keyValuePair.getKey();
        assertEquals("Unexpected KeyValuePair.getKey()", "plasibo", key);

        final String value = keyValuePair.getValue();
        assertEquals("Unexpected KeyValuePair.getValue()", "", value);
    }

    @Test
    public void keyValuePair_constructor_strStr_plasiboNULL() {

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<String, String>("plasibo", null);
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        final String key = keyValuePair.getKey();
        assertEquals("Unexpected KeyValuePair.getKey()", "plasibo", key);

        final String value = keyValuePair.getValue();
        assertEquals("Unexpected KeyValuePair.getValue()", null, value);
    }

    @Test
    public void keyValuePair_constructor_strStr_plasiboPlasibo() {

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<String, String>("plasibo", "plasibo");
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        final String key = keyValuePair.getKey();
        assertEquals("Unexpected KeyValuePair.getKey()", "plasibo", key);

        final String value = keyValuePair.getValue();
        assertEquals("Unexpected KeyValuePair.getValue()", "plasibo", value);
    }

    @Test
    public void keyValuePair_equals_strBoo_plasiboFALSE() {

        final KeyValuePair<String, Boolean> REF = STR_BOO_PLASIBO_FALSE;

        final KeyValuePair<String, Boolean> keyValuePair = new KeyValuePair<String, Boolean>();
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        keyValuePair.setKey("plasibo");

        keyValuePair.setValue(false);
        assertTrue("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue(null);
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue(true);
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue(true);
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(new Object()));
    }

    @Test
    public void keyValuePair_equals_strBoo_plasiboNULL() {

        final KeyValuePair<String, Boolean> REF = STR_BOO_PLASIBO_NULL;

        final KeyValuePair<String, Boolean> keyValuePair = new KeyValuePair<String, Boolean>();
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        keyValuePair.setKey("plasibo");

        keyValuePair.setValue(false);
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue(null);
        assertTrue("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue(true);
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue(true);
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(new Object()));
    }

    @Test
    public void keyValuePair_equals_strBoo_plasiboTRUE() {

        final KeyValuePair<String, Boolean> REF = STR_BOO_PLASIBO_TRUE;

        final KeyValuePair<String, Boolean> keyValuePair = new KeyValuePair<String, Boolean>();
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        keyValuePair.setKey("plasibo");

        keyValuePair.setValue(false);
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue(null);
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue(true);
        assertTrue("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue(true);
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(new Object()));
    }

    @Test
    public void keyValuePair_equals_strInt_plasiboMAX() {

        final KeyValuePair<String, Integer> REF = STR_INT_PLASIBO_MAX;

        final KeyValuePair<String, Integer> keyValuePair = new KeyValuePair<String, Integer>();
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        keyValuePair.setKey("plasibo");

        keyValuePair.setValue(Integer.MAX_VALUE);
        assertTrue("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue(Integer.MIN_VALUE);
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue(null);
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue(0);
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue(0);
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(new Object()));
    }

    @Test
    public void keyValuePair_equals_strInt_plasiboMIN() {

        final KeyValuePair<String, Integer> REF = STR_INT_PLASIBO_MIN;

        final KeyValuePair<String, Integer> keyValuePair = new KeyValuePair<String, Integer>();
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        keyValuePair.setKey("plasibo");

        keyValuePair.setValue(Integer.MAX_VALUE);
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue(Integer.MIN_VALUE);
        assertTrue("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue(null);
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue(0);
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue(0);
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(new Object()));
    }

    @Test
    public void keyValuePair_equals_strInt_plasiboNULL() {

        final KeyValuePair<String, Integer> REF = STR_INT_PLASIBO_NULL;

        final KeyValuePair<String, Integer> keyValuePair = new KeyValuePair<String, Integer>();
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        keyValuePair.setKey("plasibo");

        keyValuePair.setValue(Integer.MAX_VALUE);
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue(Integer.MIN_VALUE);
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue(null);
        assertTrue("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue(0);
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue(0);
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(new Object()));
    }

    @Test
    public void keyValuePair_equals_strInt_plasiboZero() {

        final KeyValuePair<String, Integer> REF = STR_INT_PLASIBO_ZERO;

        final KeyValuePair<String, Integer> keyValuePair = new KeyValuePair<String, Integer>();
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        keyValuePair.setKey("plasibo");

        keyValuePair.setValue(Integer.MAX_VALUE);
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue(Integer.MIN_VALUE);
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue(null);
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue(0);
        assertTrue("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue(0);
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(new Object()));
    }

    @Test
    public void keyValuePair_equals_strStr_emptyEmpty() {

        final KeyValuePair<String, String> REF = STR_STR_EMPTY_EMPTY;

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<String, String>();
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        keyValuePair.setKey("");

        keyValuePair.setValue("");
        assertTrue("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue(null);
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue("plasibo");
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue("new Object()");
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(new Object()));
    }

    @Test
    public void keyValuePair_equals_strStr_emptyNULL() {

        final KeyValuePair<String, String> REF = STR_STR_EMPTY_NULL;

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<String, String>();
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        keyValuePair.setKey("");

        keyValuePair.setValue("");
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue(null);
        assertTrue("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue("plasibo");
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue("new Object()");
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(new Object()));
    }

    @Test
    public void keyValuePair_equals_strStr_emptyPlasibo() {

        final KeyValuePair<String, String> REF = STR_STR_EMPTY_PLASIBO;

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<String, String>();
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        keyValuePair.setKey("");

        keyValuePair.setValue("");
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue(null);
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue("plasibo");
        assertTrue("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue("new Object()");
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(new Object()));
    }

    @Test
    public void keyValuePair_equals_strStr_NULLEmpty() {

        final KeyValuePair<String, String> REF = STR_STR_NULL_EMPTY;

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<String, String>();
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        keyValuePair.setKey(null);

        keyValuePair.setValue("");
        assertTrue("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue(null);
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue("plasibo");
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue("new Object()");
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(new Object()));
    }

    @Test
    public void keyValuePair_equals_strStr_NULLNULL() {

        final KeyValuePair<String, String> REF = STR_STR_NULL_NULL;

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<String, String>();
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        keyValuePair.setKey(null);

        keyValuePair.setValue("");
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue(null);
        assertTrue("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue("plasibo");
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue("new Object()");
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(new Object()));
    }

    @Test
    public void keyValuePair_equals_strStr_NULLPlasibo() {

        final KeyValuePair<String, String> REF = STR_STR_NULL_PLASIBO;

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<String, String>();
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        keyValuePair.setKey(null);

        keyValuePair.setValue("");
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue(null);
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue("plasibo");
        assertTrue("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue("new Object()");
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(new Object()));
    }

    @Test
    public void keyValuePair_equals_strStr_plasiboEmpty() {

        final KeyValuePair<String, String> REF = STR_STR_PLASIBO_EMPTY;

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<String, String>();
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        keyValuePair.setKey("plasibo");

        keyValuePair.setValue("");
        assertTrue("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue(null);
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue("plasibo");
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue("new Object()");
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(new Object()));
    }

    @Test
    public void keyValuePair_equals_strStr_plasiboNULL() {

        final KeyValuePair<String, String> REF = STR_STR_PLASIBO_NULL;

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<String, String>();
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        keyValuePair.setKey("plasibo");

        keyValuePair.setValue("");
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue(null);
        assertTrue("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue("plasibo");
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue("new Object()");
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(new Object()));
    }

    @Test
    public void keyValuePair_equals_strStr_plasiboPlasibo() {

        final KeyValuePair<String, String> REF = STR_STR_PLASIBO_PLASIBO;

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<String, String>();
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        keyValuePair.setKey("plasibo");

        keyValuePair.setValue("");
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue(null);
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue("plasibo");
        assertTrue("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair));

        keyValuePair.setValue("new Object()");
        assertFalse("Unexpected KeyValuePair.equals(Object)", REF.equals(new Object()));
    }

    @Test
    public void keyValuePair_getKey_strStr_emptyPlasibo() {

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<String, String>();
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        keyValuePair.setKey("");

        final String key = keyValuePair.getKey();
        assertEquals("Unexpected KeyValuePair.getKey()", "", key);
    }

    @Test
    public void keyValuePair_getKey_strStr_NULLPlasibo() {

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<String, String>();
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        keyValuePair.setKey(null);

        final String key = keyValuePair.getKey();
        assertNull("Unexpected KeyValuePair.getKey()", key);
    }

    @Test
    public void keyValuePair_getKey_strStr_plasiboPlasibo() {

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<String, String>();
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        keyValuePair.setKey("Plasibo");

        final String key = keyValuePair.getKey();
        assertEquals("Unexpected KeyValuePair.getKey()", "Plasibo", key);
    }

    @Test
    public void keyValuePair_getValue_strBoo_emptyFALSE() {

        final KeyValuePair<String, Boolean> keyValuePair = new KeyValuePair<String, Boolean>();
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        keyValuePair.setValue(false);

        final Boolean bool = keyValuePair.getValue();
        assertEquals("Unexpected KeyValuePair.getValue()", Boolean.FALSE, bool);
    }

    @Test
    public void keyValuePair_getValue_strBoo_emptyNULL() {

        final KeyValuePair<String, Boolean> keyValuePair = new KeyValuePair<String, Boolean>();
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        keyValuePair.setValue(null);

        final Boolean bool = keyValuePair.getValue();
        assertNull("Unexpected KeyValuePair.getValue()", bool);
    }

    @Test
    public void keyValuePair_getValue_strBoo_emptyTRUE() {

        final KeyValuePair<String, Boolean> keyValuePair = new KeyValuePair<String, Boolean>();
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        keyValuePair.setValue(true);

        final Boolean bool = keyValuePair.getValue();
        assertEquals("Unexpected KeyValuePair.getValue()", Boolean.TRUE, bool);
    }

    @Test
    public void keyValuePair_getValue_strInt_emptyMAX() {

        final KeyValuePair<String, Integer> keyValuePair = new KeyValuePair<String, Integer>();
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        keyValuePair.setValue(Integer.MAX_VALUE);

        final Integer integer = keyValuePair.getValue();
        assertEquals("Unexpected KeyValuePair.getValue()", Integer.valueOf(Integer.MAX_VALUE), integer);
    }

    @Test
    public void keyValuePair_getValue_strInt_emptyMIN() {

        final KeyValuePair<String, Integer> keyValuePair = new KeyValuePair<String, Integer>();
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        keyValuePair.setValue(Integer.MIN_VALUE);

        final Integer integer = keyValuePair.getValue();
        assertEquals("Unexpected KeyValuePair.getValue()", Integer.valueOf(Integer.MIN_VALUE), integer);
    }

    @Test
    public void keyValuePair_getValue_strInt_emptyNULL() {

        final KeyValuePair<String, Integer> keyValuePair = new KeyValuePair<String, Integer>();
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        keyValuePair.setValue(null);

        final Integer integer = keyValuePair.getValue();
        assertNull("Unexpected KeyValuePair.getValue()", integer);
    }

    @Test
    public void keyValuePair_getValue_strInt_emptyZero() {

        final KeyValuePair<String, Integer> keyValuePair = new KeyValuePair<String, Integer>();
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        keyValuePair.setValue(0);

        final Integer integer = keyValuePair.getValue();
        assertEquals("Unexpected KeyValuePair.getValue()", Integer.valueOf(0), integer);
    }

    @Test
    public void keyValuePair_getValue_strStr_emptyEmpty() {

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<String, String>();
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        keyValuePair.setValue("");

        final String string = keyValuePair.getValue();
        assertEquals("Unexpected KeyValuePair.getValue()", "", string);
    }

    @Test
    public void keyValuePair_getValue_strStr_emptyNULL() {

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<String, String>();
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        keyValuePair.setValue(null);

        final String string = keyValuePair.getValue();
        assertNull("Unexpected KeyValuePair.getValue()", string);
    }

    @Test
    public void keyValuePair_getValue_strStr_emptyPlasibo() {

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<String, String>();
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        keyValuePair.setValue("Plasibo");

        final String string = keyValuePair.getValue();
        assertEquals("Unexpected KeyValuePair.getValue()", "Plasibo", string);
    }

    @Test
    public void keyValuePair_hashCode_strBoo_plasiboFALSE() {

        final KeyValuePair<String, Boolean> keyValuePair = new KeyValuePair<String, Boolean>();
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        keyValuePair.setKey("Plasibo");
        keyValuePair.setValue(false);

        final int keyValuePairHashCode = keyValuePair.hashCode();
        assertEquals("Unexpected KeyValuePair.hashCode()", 311121331, keyValuePairHashCode);
    }

    @Test
    public void keyValuePair_hashCode_strBoo_plasiboNULL() {

        final KeyValuePair<String, Boolean> keyValuePair = new KeyValuePair<String, Boolean>();
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        keyValuePair.setKey("Plasibo");
        keyValuePair.setValue(null);

        final int keyValuePairHashCode = keyValuePair.hashCode();
        assertEquals("Unexpected KeyValuePair.hashCode()", 311120094, keyValuePairHashCode);
    }

    @Test
    public void keyValuePair_hashCode_strBoo_plasiboTRUE() {

        final KeyValuePair<String, Boolean> keyValuePair = new KeyValuePair<String, Boolean>();
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        keyValuePair.setKey("Plasibo");
        keyValuePair.setValue(true);

        final int keyValuePairHashCode = keyValuePair.hashCode();
        assertEquals("Unexpected KeyValuePair.hashCode()", 311121325, keyValuePairHashCode);
    }

    @Test
    public void keyValuePair_hashCode_strInt_plasiboMAX() {

        final KeyValuePair<String, Integer> keyValuePair = new KeyValuePair<String, Integer>();
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        keyValuePair.setKey("Plasibo");
        keyValuePair.setValue(Integer.MAX_VALUE);

        final int keyValuePairHashCode = keyValuePair.hashCode();
        assertEquals("Unexpected KeyValuePair.hashCode()", -1836363555, keyValuePairHashCode);
    }

    @Test
    public void keyValuePair_hashCode_strInt_plasiboMIN() {

        final KeyValuePair<String, Integer> keyValuePair = new KeyValuePair<String, Integer>();
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        keyValuePair.setKey("Plasibo");
        keyValuePair.setValue(Integer.MIN_VALUE);

        final int keyValuePairHashCode = keyValuePair.hashCode();
        assertEquals("Unexpected KeyValuePair.hashCode()", -1836363554, keyValuePairHashCode);
    }

    @Test
    public void keyValuePair_hashCode_strInt_plasiboNULL() {

        final KeyValuePair<String, Integer> keyValuePair = new KeyValuePair<String, Integer>();
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        keyValuePair.setKey("Plasibo");
        keyValuePair.setValue(null);

        final int keyValuePairHashCode = keyValuePair.hashCode();
        assertEquals("Unexpected KeyValuePair.hashCode()", 311120094, keyValuePairHashCode);
    }

    @Test
    public void keyValuePair_hashCode_strInt_plasiboZero() {

        final KeyValuePair<String, Integer> keyValuePair = new KeyValuePair<String, Integer>();
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        keyValuePair.setKey("Plasibo");
        keyValuePair.setValue(0);

        final int keyValuePairHashCode = keyValuePair.hashCode();
        assertEquals("Unexpected KeyValuePair.hashCode()", 311120094, keyValuePairHashCode);
    }

    @Test
    public void keyValuePair_hashCode_strStr_emptyEmpty() {

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<String, String>();
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        final int keyValuePairHashCode = keyValuePair.hashCode();
        assertEquals("Unexpected KeyValuePair.hashCode()", -62888490, keyValuePairHashCode);
    }

    @Test
    public void keyValuePair_hashCode_strStr_emptyPlasibo() {

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<String, String>();
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        keyValuePair.setValue("Plasibo");

        final int keyValuePairHashCode = keyValuePair.hashCode();
        assertEquals("Unexpected KeyValuePair.hashCode()", 1108021822, keyValuePairHashCode);
    }

    @Test
    public void keyValuePair_hashCode_strStr_plasiboEmpty() {

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<String, String>();
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        keyValuePair.setKey("Plasibo");

        final int keyValuePairHashCode = keyValuePair.hashCode();
        assertEquals("Unexpected KeyValuePair.hashCode()", 311120094, keyValuePairHashCode);
    }

    @Test
    public void keyValuePair_hashCode_strStr_plasiboPlasibo() {

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<String, String>();
        assertNotNull("KeyValuePair should not be null", keyValuePair);

        keyValuePair.setKey("Plasibo");
        keyValuePair.setValue("Plasibo");

        final int keyValuePairHashCode = keyValuePair.hashCode();
        assertEquals("Unexpected KeyValuePair.hashCode()", 1482030406, keyValuePairHashCode);
    }

    @Test(enabled = false)
    public void keyValuePair_toString_strBoo_plasiboFALSE() {
    }

    @Test(enabled = false)
    public void keyValuePair_toString_strBoo_plasiboNULL() {
    }

    @Test(enabled = false)
    public void keyValuePair_toString_strBoo_plasiboTRUE() {
    }

    @Test(enabled = false)
    public void keyValuePair_toString_strInt_plasiboMAX() {
    }

    @Test(enabled = false)
    public void keyValuePair_toString_strInt_plasiboMIN() {
    }

    @Test(enabled = false)
    public void keyValuePair_toString_strInt_plasiboNULL() {
    }

    @Test(enabled = false)
    public void keyValuePair_toString_strInt_plasiboZero() {
    }

    @Test(enabled = false)
    public void keyValuePair_toString_strStr_emptyEmpty() {
    }

    @Test(enabled = false)
    public void keyValuePair_toString_strStr_emptyNULL() {
    }

    @Test(enabled = false)
    public void keyValuePair_toString_strStr_emptyPlasibo() {
    }

    @Test(enabled = false)
    public void keyValuePair_toString_strStr_NULLEmpty() {
    }

    @Test(enabled = false)
    public void keyValuePair_toString_strStr_NULLNULL() {
    }

    @Test(enabled = false)
    public void keyValuePair_toString_strStr_NULLPlasibo() {
    }

    @Test(enabled = false)
    public void keyValuePair_toString_strStr_plasiboEmpty() {
    }

    @Test(enabled = false)
    public void keyValuePair_toString_strStr_plasiboNULL() {
    }

    @Test(enabled = false)
    public void keyValuePair_toString_strStr_plasiboPlasibo() {
    }

}

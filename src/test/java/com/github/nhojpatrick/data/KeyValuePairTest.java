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

import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.hamcrest.core.IsNull.nullValue;

/**
 * Key Value Pair tests.
 * 
 * @author nhojpatrick
 */
public class KeyValuePairTest {

    private final KeyValuePair<String, Boolean> STR_BOO_PLASIBO_FALSE = new KeyValuePair<>("plasibo", false);

    private final KeyValuePair<String, Boolean> STR_BOO_PLASIBO_NULL = new KeyValuePair<>("plasibo", null);

    private final KeyValuePair<String, Boolean> STR_BOO_PLASIBO_TRUE = new KeyValuePair<>("plasibo", true);

    private final KeyValuePair<String, Integer> STR_INT_PLASIBO_MAX = new KeyValuePair<>("plasibo",
            Integer.MAX_VALUE);

    private final KeyValuePair<String, Integer> STR_INT_PLASIBO_MIN = new KeyValuePair<>("plasibo",
            Integer.MIN_VALUE);

    private final KeyValuePair<String, Integer> STR_INT_PLASIBO_NULL = new KeyValuePair<>("plasibo", null);

    private final KeyValuePair<String, Integer> STR_INT_PLASIBO_ZERO = new KeyValuePair<>("plasibo", 0);

    private final KeyValuePair<String, String> STR_STR_EMPTY_EMPTY = new KeyValuePair<>("", "");

    private final KeyValuePair<String, String> STR_STR_EMPTY_NULL = new KeyValuePair<>("", null);

    private final KeyValuePair<String, String> STR_STR_EMPTY_PLASIBO = new KeyValuePair<>("", "plasibo");

    private final KeyValuePair<String, String> STR_STR_NULL_EMPTY = new KeyValuePair<>(null, "");

    private final KeyValuePair<String, String> STR_STR_NULL_NULL = new KeyValuePair<>(null, null);

    private final KeyValuePair<String, String> STR_STR_NULL_PLASIBO = new KeyValuePair<>(null, "plasibo");

    private final KeyValuePair<String, String> STR_STR_PLASIBO_EMPTY = new KeyValuePair<>("plasibo", "");

    private final KeyValuePair<String, String> STR_STR_PLASIBO_NULL = new KeyValuePair<>("plasibo", null);

    private final KeyValuePair<String, String> STR_STR_PLASIBO_PLASIBO = new KeyValuePair<>("plasibo",
            "plasibo");

    @Test
    public void keyValuePair_constructor_strBoo_plasiboFALSE() {

        final KeyValuePair<String, Boolean> keyValuePair = new KeyValuePair<>("plasibo", Boolean.FALSE);
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        final String key = keyValuePair.getKey();
        assertThat("Unexpected KeyValuePair.getKey()", key, is(equalTo("plasibo")));

        final Boolean value = keyValuePair.getValue();
        assertThat("Unexpected KeyValuePair.getValue()", value, is(equalTo(Boolean.FALSE)));
    }

    @Test
    public void keyValuePair_constructor_strBoo_plasiboNULL() {

        final KeyValuePair<String, Boolean> keyValuePair = new KeyValuePair<>("plasibo", null);
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        final String key = keyValuePair.getKey();
        assertThat("Unexpected KeyValuePair.getKey()", key, is(equalTo("plasibo")));

        final Boolean value = keyValuePair.getValue();
        assertThat("Unexpected KeyValuePair.getValue()", value, is(equalTo(null)));
    }

    @Test
    public void keyValuePair_constructor_strBoo_plasiboTRUE() {

        final KeyValuePair<String, Boolean> keyValuePair = new KeyValuePair<>("plasibo", Boolean.TRUE);
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        final String key = keyValuePair.getKey();
        assertThat("Unexpected KeyValuePair.getKey()", key, is(equalTo("plasibo")));

        final Boolean value = keyValuePair.getValue();
        assertThat("Unexpected KeyValuePair.getValue()", value, is(equalTo(Boolean.TRUE)));
    }

    @Test
    public void keyValuePair_constructor_strInt_plasiboMAX() {

        final KeyValuePair<String, Integer> keyValuePair = new KeyValuePair<>("plasibo",
                Integer.MAX_VALUE);
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        final String key = keyValuePair.getKey();
        assertThat("Unexpected KeyValuePair.getKey()", key, is(equalTo("plasibo")));

        final Integer value = keyValuePair.getValue();
        assertThat("Unexpected KeyValuePair.getValue()", value, is(equalTo(Integer.MAX_VALUE)));
    }

    @Test
    public void keyValuePair_constructor_strInt_plasiboMIN() {

        final KeyValuePair<String, Integer> keyValuePair = new KeyValuePair<>("plasibo",
                Integer.MIN_VALUE);
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        final String key = keyValuePair.getKey();
        assertThat("Unexpected KeyValuePair.getKey()", key, is(equalTo("plasibo")));

        final Integer value = keyValuePair.getValue();
        assertThat("Unexpected KeyValuePair.getValue()", value, is(equalTo(Integer.MIN_VALUE)));
    }

    @Test
    public void keyValuePair_constructor_strInt_plasiboNULL() {

        final KeyValuePair<String, Integer> keyValuePair = new KeyValuePair<>("plasibo", null);
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        final String key = keyValuePair.getKey();
        assertThat("Unexpected KeyValuePair.getKey()", key, is(equalTo("plasibo")));

        final Integer value = keyValuePair.getValue();
        assertThat("Unexpected KeyValuePair.getValue()", value, is(equalTo(null)));
    }

    @Test
    public void keyValuePair_constructor_strInt_plasiboZero() {

        final KeyValuePair<String, Integer> keyValuePair = new KeyValuePair<>("plasibo", 0);
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        final String key = keyValuePair.getKey();
        assertThat("Unexpected KeyValuePair.getKey()", key, is(equalTo("plasibo")));

        final Integer value = keyValuePair.getValue();
        assertThat("Unexpected KeyValuePair.getValue()", value, is(equalTo(0)));
    }

    @Test
    public void keyValuePair_constructor_strStr_emptyEmpty() {

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<>("", "");
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        final String key = keyValuePair.getKey();
        assertThat("Unexpected KeyValuePair.getKey()", key, is(equalTo("")));

        final String value = keyValuePair.getValue();
        assertThat("Unexpected KeyValuePair.getValue()", value, is(equalTo("")));
    }

    @Test
    public void keyValuePair_constructor_strStr_emptyNULL() {

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<>("", null);
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        final String key = keyValuePair.getKey();
        assertThat("Unexpected KeyValuePair.getKey()", key, is(equalTo("")));

        final String value = keyValuePair.getValue();
        assertThat("Unexpected KeyValuePair.getValue()", value, is(equalTo(null)));
    }

    @Test
    public void keyValuePair_constructor_strStr_emptyPlasibo() {

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<>("", "plasibo");
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        final String key = keyValuePair.getKey();
        assertThat("Unexpected KeyValuePair.getKey()", key, is(equalTo("")));

        final String value = keyValuePair.getValue();
        assertThat("Unexpected KeyValuePair.getValue()", value, is(equalTo("plasibo")));
    }

    @Test
    public void keyValuePair_constructor_strStr_NULLEmpty() {

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<>(null, "");
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        final String key = keyValuePair.getKey();
        assertThat("Unexpected KeyValuePair.getKey()", key, is(equalTo(null)));

        final String value = keyValuePair.getValue();
        assertThat("Unexpected KeyValuePair.getValue()", value, is(equalTo("")));
    }

    @Test
    public void keyValuePair_constructor_strStr_NULLNULL() {

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<>(null, null);
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        final String key = keyValuePair.getKey();
        assertThat("Unexpected KeyValuePair.getKey()", key, is(equalTo(null)));

        final String value = keyValuePair.getValue();
        assertThat("Unexpected KeyValuePair.getValue()", value, is(equalTo(null)));
    }

    @Test
    public void keyValuePair_constructor_strStr_plasiboEmpty() {

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<>("plasibo", "");
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        final String key = keyValuePair.getKey();
        assertThat("Unexpected KeyValuePair.getKey()", key, is(equalTo("plasibo")));

        final String value = keyValuePair.getValue();
        assertThat("Unexpected KeyValuePair.getValue()", value, is(equalTo("")));
    }

    @Test
    public void keyValuePair_constructor_strStr_plasiboNULL() {

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<>("plasibo", null);
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        final String key = keyValuePair.getKey();
        assertThat("Unexpected KeyValuePair.getKey()", key, is(equalTo("plasibo")));

        final String value = keyValuePair.getValue();
        assertThat("Unexpected KeyValuePair.getValue()", value, is(equalTo(null)));
    }

    @Test
    public void keyValuePair_constructor_strStr_plasiboPlasibo() {

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<>("plasibo", "plasibo");
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        final String key = keyValuePair.getKey();
        assertThat("Unexpected KeyValuePair.getKey()", key, is(equalTo("plasibo")));

        final String value = keyValuePair.getValue();
        assertThat("Unexpected KeyValuePair.getValue()", value, is(equalTo("plasibo")));
    }

    @Test
    public void keyValuePair_equals_strBoo_plasiboFALSE() {

        final KeyValuePair<String, Boolean> REF = STR_BOO_PLASIBO_FALSE;

        final KeyValuePair<String, Boolean> keyValuePair = new KeyValuePair<>();
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        keyValuePair.setKey("plasibo");

        keyValuePair.setValue(false);
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(true)));

        keyValuePair.setValue(null);
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(false)));

        keyValuePair.setValue(true);
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(false)));

        keyValuePair.setValue(true);
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(new Object()), is(equalTo(false)));
    }

    @Test
    public void keyValuePair_equals_strBoo_plasiboNULL() {

        final KeyValuePair<String, Boolean> REF = STR_BOO_PLASIBO_NULL;

        final KeyValuePair<String, Boolean> keyValuePair = new KeyValuePair<>();
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        keyValuePair.setKey("plasibo");

        keyValuePair.setValue(false);
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(false)));

        keyValuePair.setValue(null);
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(true)));

        keyValuePair.setValue(true);
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(false)));

        keyValuePair.setValue(true);
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(new Object()), is(equalTo(false)));
    }

    @Test
    public void keyValuePair_equals_strBoo_plasiboTRUE() {

        final KeyValuePair<String, Boolean> REF = STR_BOO_PLASIBO_TRUE;

        final KeyValuePair<String, Boolean> keyValuePair = new KeyValuePair<>();
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        keyValuePair.setKey("plasibo");

        keyValuePair.setValue(false);
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(false)));

        keyValuePair.setValue(null);
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(false)));

        keyValuePair.setValue(true);
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(true)));

        keyValuePair.setValue(true);
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(new Object()), is(equalTo(false)));
    }

    @Test
    public void keyValuePair_equals_strInt_plasiboMAX() {

        final KeyValuePair<String, Integer> REF = STR_INT_PLASIBO_MAX;

        final KeyValuePair<String, Integer> keyValuePair = new KeyValuePair<>();
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        keyValuePair.setKey("plasibo");

        keyValuePair.setValue(Integer.MAX_VALUE);
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(true)));

        keyValuePair.setValue(Integer.MIN_VALUE);
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(false)));

        keyValuePair.setValue(null);
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(false)));

        keyValuePair.setValue(0);
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(false)));

        keyValuePair.setValue(0);
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(new Object()), is(equalTo(false)));
    }

    @Test
    public void keyValuePair_equals_strInt_plasiboMIN() {

        final KeyValuePair<String, Integer> REF = STR_INT_PLASIBO_MIN;

        final KeyValuePair<String, Integer> keyValuePair = new KeyValuePair<>();
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        keyValuePair.setKey("plasibo");

        keyValuePair.setValue(Integer.MAX_VALUE);
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(false)));

        keyValuePair.setValue(Integer.MIN_VALUE);
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(true)));

        keyValuePair.setValue(null);
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(false)));

        keyValuePair.setValue(0);
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(false)));

        keyValuePair.setValue(0);
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(new Object()), is(equalTo(false)));
    }

    @Test
    public void keyValuePair_equals_strInt_plasiboNULL() {

        final KeyValuePair<String, Integer> REF = STR_INT_PLASIBO_NULL;

        final KeyValuePair<String, Integer> keyValuePair = new KeyValuePair<>();
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        keyValuePair.setKey("plasibo");

        keyValuePair.setValue(Integer.MAX_VALUE);
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(false)));

        keyValuePair.setValue(Integer.MIN_VALUE);
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(false)));

        keyValuePair.setValue(null);
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(true)));

        keyValuePair.setValue(0);
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(false)));

        keyValuePair.setValue(0);
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(new Object()), is(equalTo(false)));
    }

    @Test
    public void keyValuePair_equals_strInt_plasiboZero() {

        final KeyValuePair<String, Integer> REF = STR_INT_PLASIBO_ZERO;

        final KeyValuePair<String, Integer> keyValuePair = new KeyValuePair<>();
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        keyValuePair.setKey("plasibo");

        keyValuePair.setValue(Integer.MAX_VALUE);
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(false)));

        keyValuePair.setValue(Integer.MIN_VALUE);
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(false)));

        keyValuePair.setValue(null);
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(false)));

        keyValuePair.setValue(0);
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(true)));

        keyValuePair.setValue(0);
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(new Object()), is(equalTo(false)));
    }

    @Test
    public void keyValuePair_equals_strStr_emptyEmpty() {

        final KeyValuePair<String, String> REF = STR_STR_EMPTY_EMPTY;

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<>();
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        keyValuePair.setKey("");

        keyValuePair.setValue("");
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(true)));

        keyValuePair.setValue(null);
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(false)));

        keyValuePair.setValue("plasibo");
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(false)));

        keyValuePair.setValue("new Object()");
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(new Object()), is(equalTo(false)));
    }

    @Test
    public void keyValuePair_equals_strStr_emptyNULL() {

        final KeyValuePair<String, String> REF = STR_STR_EMPTY_NULL;

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<>();
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        keyValuePair.setKey("");

        keyValuePair.setValue("");
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(false)));

        keyValuePair.setValue(null);
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(true)));

        keyValuePair.setValue("plasibo");
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(false)));

        keyValuePair.setValue("new Object()");
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(new Object()), is(equalTo(false)));
    }

    @Test
    public void keyValuePair_equals_strStr_emptyPlasibo() {

        final KeyValuePair<String, String> REF = STR_STR_EMPTY_PLASIBO;

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<>();
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        keyValuePair.setKey("");

        keyValuePair.setValue("");
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(false)));

        keyValuePair.setValue(null);
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(false)));

        keyValuePair.setValue("plasibo");
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(true)));

        keyValuePair.setValue("new Object()");
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(new Object()), is(equalTo(false)));
    }

    @Test
    public void keyValuePair_equals_strStr_NULLEmpty() {

        final KeyValuePair<String, String> REF = STR_STR_NULL_EMPTY;

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<>();
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        keyValuePair.setKey(null);

        keyValuePair.setValue("");
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(true)));

        keyValuePair.setValue(null);
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(false)));

        keyValuePair.setValue("plasibo");
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(false)));

        keyValuePair.setValue("new Object()");
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(new Object()), is(equalTo(false)));
    }

    @Test
    public void keyValuePair_equals_strStr_NULLNULL() {

        final KeyValuePair<String, String> REF = STR_STR_NULL_NULL;

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<>();
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        keyValuePair.setKey(null);

        keyValuePair.setValue("");
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(false)));

        keyValuePair.setValue(null);
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(true)));

        keyValuePair.setValue("plasibo");
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(false)));

        keyValuePair.setValue("new Object()");
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(new Object()), is(equalTo(false)));
    }

    @Test
    public void keyValuePair_equals_strStr_NULLPlasibo() {

        final KeyValuePair<String, String> REF = STR_STR_NULL_PLASIBO;

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<>();
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        keyValuePair.setKey(null);

        keyValuePair.setValue("");
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(false)));

        keyValuePair.setValue(null);
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(false)));

        keyValuePair.setValue("plasibo");
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(true)));

        keyValuePair.setValue("new Object()");
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(new Object()), is(equalTo(false)));
    }

    @Test
    public void keyValuePair_equals_strStr_plasiboEmpty() {

        final KeyValuePair<String, String> REF = STR_STR_PLASIBO_EMPTY;

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<>();
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        keyValuePair.setKey("plasibo");

        keyValuePair.setValue("");
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(true)));

        keyValuePair.setValue(null);
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(false)));

        keyValuePair.setValue("plasibo");
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(false)));

        keyValuePair.setValue("new Object()");
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(new Object()), is(equalTo(false)));
    }

    @Test
    public void keyValuePair_equals_strStr_plasiboNULL() {

        final KeyValuePair<String, String> REF = STR_STR_PLASIBO_NULL;

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<>();
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        keyValuePair.setKey("plasibo");

        keyValuePair.setValue("");
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(false)));

        keyValuePair.setValue(null);
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(true)));

        keyValuePair.setValue("plasibo");
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(false)));

        keyValuePair.setValue("new Object()");
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(new Object()), is(equalTo(false)));
    }

    @Test
    public void keyValuePair_equals_strStr_plasiboPlasibo() {

        final KeyValuePair<String, String> REF = STR_STR_PLASIBO_PLASIBO;

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<>();
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        keyValuePair.setKey("plasibo");

        keyValuePair.setValue("");
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(false)));

        keyValuePair.setValue(null);
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(false)));

        keyValuePair.setValue("plasibo");
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(keyValuePair), is(equalTo(true)));

        keyValuePair.setValue("new Object()");
        assertThat("Unexpected KeyValuePair.equals(Object)", REF.equals(new Object()), is(equalTo(false)));
    }

    @Test
    public void keyValuePair_getKey_strStr_emptyPlasibo() {

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<>();
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        keyValuePair.setKey("");

        final String key = keyValuePair.getKey();
        assertThat("Unexpected KeyValuePair.getKey()", key, is(equalTo("")));
    }

    @Test
    public void keyValuePair_getKey_strStr_NULLPlasibo() {

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<>();
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        keyValuePair.setKey(null);

        final String key = keyValuePair.getKey();
        assertThat("Unexpected KeyValuePair.getKey()", key, is(nullValue()));
    }

    @Test
    public void keyValuePair_getKey_strStr_plasiboPlasibo() {

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<>();
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        keyValuePair.setKey("Plasibo");

        final String key = keyValuePair.getKey();
        assertThat("Unexpected KeyValuePair.getKey()", key, is(equalTo("Plasibo")));
    }

    @Test
    public void keyValuePair_getValue_strBoo_emptyFALSE() {

        final KeyValuePair<String, Boolean> keyValuePair = new KeyValuePair<>();
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        keyValuePair.setValue(false);

        final Boolean bool = keyValuePair.getValue();
        assertThat("Unexpected KeyValuePair.getValue()", bool, is(equalTo(Boolean.FALSE)));
    }

    @Test
    public void keyValuePair_getValue_strBoo_emptyNULL() {

        final KeyValuePair<String, Boolean> keyValuePair = new KeyValuePair<>();
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        keyValuePair.setValue(null);

        final Boolean bool = keyValuePair.getValue();
        assertThat("Unexpected KeyValuePair.getValue()", bool, is(nullValue()));
    }

    @Test
    public void keyValuePair_getValue_strBoo_emptyTRUE() {

        final KeyValuePair<String, Boolean> keyValuePair = new KeyValuePair<>();
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        keyValuePair.setValue(true);

        final Boolean bool = keyValuePair.getValue();
        assertThat("Unexpected KeyValuePair.getValue()", bool, is(equalTo(Boolean.TRUE)));
    }

    @Test
    public void keyValuePair_getValue_strInt_emptyMAX() {

        final KeyValuePair<String, Integer> keyValuePair = new KeyValuePair<>();
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        keyValuePair.setValue(Integer.MAX_VALUE);

        final Integer integer = keyValuePair.getValue();
        assertThat("Unexpected KeyValuePair.getValue()", integer, is(equalTo(Integer.MAX_VALUE)));
    }

    @Test
    public void keyValuePair_getValue_strInt_emptyMIN() {

        final KeyValuePair<String, Integer> keyValuePair = new KeyValuePair<>();
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        keyValuePair.setValue(Integer.MIN_VALUE);

        final Integer integer = keyValuePair.getValue();
        assertThat("Unexpected KeyValuePair.getValue()", integer, is(equalTo(Integer.MIN_VALUE)));
    }

    @Test
    public void keyValuePair_getValue_strInt_emptyNULL() {

        final KeyValuePair<String, Integer> keyValuePair = new KeyValuePair<>();
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        keyValuePair.setValue(null);

        final Integer integer = keyValuePair.getValue();
        assertThat("Unexpected KeyValuePair.getValue()", integer, is(nullValue()));
    }

    @Test
    public void keyValuePair_getValue_strInt_emptyZero() {

        final KeyValuePair<String, Integer> keyValuePair = new KeyValuePair<>();
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        keyValuePair.setValue(0);

        final Integer integer = keyValuePair.getValue();
        assertThat("Unexpected KeyValuePair.getValue()", integer, is(equalTo(0)));
    }

    @Test
    public void keyValuePair_getValue_strStr_emptyEmpty() {

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<>();
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        keyValuePair.setValue("");

        final String string = keyValuePair.getValue();
        assertThat("Unexpected KeyValuePair.getValue()", string, is(equalTo("")));
    }

    @Test
    public void keyValuePair_getValue_strStr_emptyNULL() {

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<>();
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        keyValuePair.setValue(null);

        final String string = keyValuePair.getValue();
        assertThat("Unexpected KeyValuePair.getValue()", string, is(nullValue()));
    }

    @Test
    public void keyValuePair_getValue_strStr_emptyPlasibo() {

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<>();
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        keyValuePair.setValue("Plasibo");

        final String string = keyValuePair.getValue();
        assertThat("Unexpected KeyValuePair.getValue()", string, is(equalTo("Plasibo")));
    }

    @Test
    public void keyValuePair_hashCode_strBoo_plasiboFALSE() {

        final KeyValuePair<String, Boolean> keyValuePair = new KeyValuePair<>();
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        keyValuePair.setKey("Plasibo");
        keyValuePair.setValue(false);

        final int keyValuePairHashCode = keyValuePair.hashCode();
        assertThat("Unexpected KeyValuePair.hashCode()", keyValuePairHashCode, is(equalTo(311121331)));
    }

    @Test
    public void keyValuePair_hashCode_strBoo_plasiboNULL() {

        final KeyValuePair<String, Boolean> keyValuePair = new KeyValuePair<>();
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        keyValuePair.setKey("Plasibo");
        keyValuePair.setValue(null);

        final int keyValuePairHashCode = keyValuePair.hashCode();
        assertThat("Unexpected KeyValuePair.hashCode()", keyValuePairHashCode, is(equalTo(311120094)));
    }

    @Test
    public void keyValuePair_hashCode_strBoo_plasiboTRUE() {

        final KeyValuePair<String, Boolean> keyValuePair = new KeyValuePair<>();
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        keyValuePair.setKey("Plasibo");
        keyValuePair.setValue(true);

        final int keyValuePairHashCode = keyValuePair.hashCode();
        assertThat("Unexpected KeyValuePair.hashCode()", keyValuePairHashCode, is(equalTo(311121325)));
    }

    @Test
    public void keyValuePair_hashCode_strInt_plasiboMAX() {

        final KeyValuePair<String, Integer> keyValuePair = new KeyValuePair<>();
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        keyValuePair.setKey("Plasibo");
        keyValuePair.setValue(Integer.MAX_VALUE);

        final int keyValuePairHashCode = keyValuePair.hashCode();
        assertThat("Unexpected KeyValuePair.hashCode()", keyValuePairHashCode, is(equalTo(-1836363555)));
    }

    @Test
    public void keyValuePair_hashCode_strInt_plasiboMIN() {

        final KeyValuePair<String, Integer> keyValuePair = new KeyValuePair<>();
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        keyValuePair.setKey("Plasibo");
        keyValuePair.setValue(Integer.MIN_VALUE);

        final int keyValuePairHashCode = keyValuePair.hashCode();
        assertThat("Unexpected KeyValuePair.hashCode()", keyValuePairHashCode, is(equalTo(-1836363554)));
    }

    @Test
    public void keyValuePair_hashCode_strInt_plasiboNULL() {

        final KeyValuePair<String, Integer> keyValuePair = new KeyValuePair<>();
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        keyValuePair.setKey("Plasibo");
        keyValuePair.setValue(null);

        final int keyValuePairHashCode = keyValuePair.hashCode();
        assertThat("Unexpected KeyValuePair.hashCode()", keyValuePairHashCode, is(equalTo(311120094)));
    }

    @Test
    public void keyValuePair_hashCode_strInt_plasiboZero() {

        final KeyValuePair<String, Integer> keyValuePair = new KeyValuePair<>();
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        keyValuePair.setKey("Plasibo");
        keyValuePair.setValue(0);

        final int keyValuePairHashCode = keyValuePair.hashCode();
        assertThat("Unexpected KeyValuePair.hashCode()", keyValuePairHashCode, is(equalTo(311120094)));
    }

    @Test
    public void keyValuePair_hashCode_strStr_emptyEmpty() {

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<>();
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        final int keyValuePairHashCode = keyValuePair.hashCode();
        assertThat("Unexpected KeyValuePair.hashCode()", keyValuePairHashCode, is(equalTo(-62888490)));
    }

    @Test
    public void keyValuePair_hashCode_strStr_emptyPlasibo() {

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<>();
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        keyValuePair.setValue("Plasibo");

        final int keyValuePairHashCode = keyValuePair.hashCode();
        assertThat("Unexpected KeyValuePair.hashCode()", keyValuePairHashCode, is(equalTo(1108021822)));
    }

    @Test
    public void keyValuePair_hashCode_strStr_plasiboEmpty() {

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<>();
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        keyValuePair.setKey("Plasibo");

        final int keyValuePairHashCode = keyValuePair.hashCode();
        assertThat("Unexpected KeyValuePair.hashCode()", keyValuePairHashCode, is(equalTo(311120094)));
    }

    @Test
    public void keyValuePair_hashCode_strStr_plasiboPlasibo() {

        final KeyValuePair<String, String> keyValuePair = new KeyValuePair<>();
        assertThat("KeyValuePair should not be null", keyValuePair, is(notNullValue()));

        keyValuePair.setKey("Plasibo");
        keyValuePair.setValue("Plasibo");

        final int keyValuePairHashCode = keyValuePair.hashCode();
        assertThat("Unexpected KeyValuePair.hashCode()", keyValuePairHashCode, is(equalTo(1482030406)));
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

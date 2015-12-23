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

/**
 * Data type constants.
 *
 * @author nhojpatrick
 */
public enum DataTypes {

    /**
     * html data type.
     */
    TEXT_HTML("text/html"),

    /**
     * plain text data type.
     */
    TEXT_PLAIN("text/plain"),

    /**
     * Unknown data type.
     */
    UNKNOWN("unknown");

    /**
     * Data type string constant of enum instance.
     */
    private final String dataType;

    /**
     * Private enum constructor.
     *
     * @param pDataType string value of constant.
     */
    DataTypes(final String pDataType) {

        this.dataType = pDataType;
    }

    /**
     * Get string value of constant.
     *
     * @return string constant value.
     */
    public String getAsString() {

        return this.dataType;
    }

}

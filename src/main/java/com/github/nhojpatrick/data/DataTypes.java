package com.github.nhojpatrick.data;

/**
 * @author john
 */
public enum DataTypes {

    /**
     * 
     */
    TEXT_HTML("text/html"),

    /**
     * 
     */
    TEXT_PLAIN("text/plain"),

    /**
     * 
     */
    UNKNOWN("unknown");

    private final String dataType;

    private DataTypes(final String pDataType) {

        this.dataType = pDataType;
    }

    public String getAsString() {

        return this.dataType;
    }

}

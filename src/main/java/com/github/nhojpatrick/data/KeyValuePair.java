/*
 * Copyright (c) 2007 - 2009 Oaki Solutions Ltd. All rights reserved.
 */
package com.github.nhojpatrick.data;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * The Key Value Pair, allowing type safe key value pairs.
 * 
 * @author john
 * @param <K>
 *            the Key type for this pair, the Key type must implement.
 * @param <V>
 *            the Value type of this pair.
 */
public class KeyValuePair<K extends CharSequence, V> implements Serializable {

    /**
     * serialVersionUID.
     */
    private static final long serialVersionUID = -7817791064159815554L;

    /**
     * The Key for this pair, of type K.
     */
    private K key;

    /**
     * The Value for this pair, of type V.
     */
    private V value;

    /**
     * Construct a key value pair, delay setting Key or Value.
     */
    public KeyValuePair() {

    }

    /**
     * Construct a key value pair.
     * 
     * @param pKey
     *            the Key for this pair.
     * @param pValue
     *            the Value for this pair.
     */
    public KeyValuePair(final K pKey, final V pValue) {

        this.key = pKey;
        this.value = pValue;
    }

    /**
     * Get the Key for this pair.
     * 
     * @return the Key for the pair, of type K.
     */
    public K getKey() {

        return this.key;
    }

    /**
     * Get the Value for this pair.
     * 
     * @return the Value for the pair, of type V.
     */
    public V getValue() {

        return this.value;
    }

    /**
     * Set the Key for this pair.
     * 
     * @param pKey
     *            the Key for the pair, or type K.
     */
    public void setKey(final K pKey) {

        this.key = pKey;
    }

    /**
     * Set the Value for this pair.
     * 
     * @param pValue
     *            the Value for the pair, of type V.
     */
    public void setValue(final V pValue) {

        this.value = pValue;
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    public boolean equals(final Object pObj) {

        boolean equals = true;

        equals &= (pObj != null);
        equals &= (pObj instanceof KeyValuePair);

        if (equals) {
            final EqualsBuilder equalsBuilder = new EqualsBuilder();
            final KeyValuePair<CharSequence, Object> obj = (KeyValuePair<CharSequence, Object>) pObj;
            equalsBuilder.append(this.key, obj.key);
            equalsBuilder.append(this.value, obj.value);

            equals = equalsBuilder.isEquals();
        }

        return equals;
    }

    /**
     * {@inheritDoc}
     */
    public int hashCode() {

        final HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
        hashCodeBuilder.append(this.getClass().getName());
        hashCodeBuilder.append(this.key);
        hashCodeBuilder.append(this.value);

        final int hashCode = hashCodeBuilder.toHashCode();

        return hashCode;
    }

}

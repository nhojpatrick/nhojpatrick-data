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

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * The Key Value Pair, allowing type safe key value pairs.
 *
 * @author nhojpatrick
 * @param <K>
 *            the Key type for this pair, the Key type must implement.
 * @param <V>
 *            the Value type of this pair.
 */
public final class KeyValuePair<K extends CharSequence, V> implements Serializable {

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

    @Override
    @SuppressWarnings("unchecked")
    public boolean equals(final Object obj) {
        if (!(obj instanceof KeyValuePair)) {
            return false;
        }

        final KeyValuePair<CharSequence, Object> that = (KeyValuePair<CharSequence, Object>) obj;

        return new EqualsBuilder()
                .append(this.key, that.key)
                .append(this.value, that.value)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(this.getClass().getName())
                .append(this.key)
                .append(this.value)
                .toHashCode();
    }

}

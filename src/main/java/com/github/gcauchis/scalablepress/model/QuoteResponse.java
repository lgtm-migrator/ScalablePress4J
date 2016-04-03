/**
 * The MIT License (MIT)
 *
 * Copyright (c) 2016 Gabriel Cauchis
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.github.gcauchis.scalablepress.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * The Quote Response json object.
 * 
 * @author gcauchis
 * @see https://scalablepress.com/docs/#standard-quote
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuoteResponse {
    /** The returned status code */
    private Number statusCode;
    /** Quoted price for the order */
    private Number total;
    /** Shipping component of quote total */
    private Number shipping;
    /** Subtotal component of quote total */
    private Number subtotal;
    /** Tax component of quote total */
    private Number tax;
    /** Other fee components of quote total */
    private Number fees;
    /** List of warnings as human readable strings */
    private List<String> warnings;
    /** Array of error objects which are preventing a successful quote */
    private List<Error> issues;
    /**
     * Array of error objects which are preventing your quote from being
     * order-ready
     */
    private List<Error> orderIssues;
    /**
     * Unique identifier which can be used to place an order, can also be used
     * to retrieve a quote
     */
    private String orderToken;
    /** “test” or “live” */
    private String mode;

    public Number getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Number statusCode) {
        this.statusCode = statusCode;
    }

    public Number getTotal() {
        return total;
    }

    public void setTotal(Number total) {
        this.total = total;
    }

    public Number getShipping() {
        return shipping;
    }

    public void setShipping(Number shipping) {
        this.shipping = shipping;
    }

    public Number getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Number subtotal) {
        this.subtotal = subtotal;
    }

    public Number getTax() {
        return tax;
    }

    public void setTax(Number tax) {
        this.tax = tax;
    }

    public Number getFees() {
        return fees;
    }

    public void setFees(Number fees) {
        this.fees = fees;
    }

    public List<String> getWarnings() {
        return warnings;
    }

    public void setWarnings(List<String> warnings) {
        this.warnings = warnings;
    }

    public List<Error> getIssues() {
        return issues;
    }

    public void setIssues(List<Error> issues) {
        this.issues = issues;
    }

    public List<Error> getOrderIssues() {
        return orderIssues;
    }

    public void setOrderIssues(List<Error> orderIssues) {
        this.orderIssues = orderIssues;
    }

    public String getOrderToken() {
        return orderToken;
    }

    public void setOrderToken(String orderToken) {
        this.orderToken = orderToken;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    @Override
    public String toString() {
        return "QuoteResponse [statusCode=" + statusCode + ", total=" + total
                + ", shipping=" + shipping + ", subtotal=" + subtotal
                + ", tax=" + tax + ", fees=" + fees + ", warnings=" + warnings
                + ", issues=" + issues + ", orderIssues=" + orderIssues
                + ", orderToken=" + orderToken + ", mode=" + mode + "]";
    }

}
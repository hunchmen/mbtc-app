/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2024. All Rights Reserved.
 * 
 */
package com.via.mbtc.response;

/**
 * @author valalberto
 * @date 25 Jan 2024
 * @version 1.0
 */
public class ApiResponse {

    private Integer transactionStatusCode;
    private String transactionStatusDescription;

    public Integer getTransactionStatusCode() {
        return transactionStatusCode;
    }

    public void setTransactionStatusCode(Integer transactionStatusCode) {
        this.transactionStatusCode = transactionStatusCode;
    }

    public String getTransactionStatusDescription() {
        return transactionStatusDescription;
    }

    public void setTransactionStatusDescription(String transactionStatusDescription) {
        this.transactionStatusDescription = transactionStatusDescription;
    }
}

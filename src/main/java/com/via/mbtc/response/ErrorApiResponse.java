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
public class ErrorApiResponse extends ApiResponse {

    private ErrorApiResponse(Builder builder) {
        super.setTransactionStatusCode(builder.transactionStatusCode);
        super.setTransactionStatusDescription(builder.transactionStatusDescription);
    }

    public static class Builder {

        private int transactionStatusCode;
        private String transactionStatusDescription;

        public Builder transactionStatusCode(int transactionStatusCode) {
            this.transactionStatusCode = transactionStatusCode;
            return this;
        }

        public Builder transactionStatusDescription(String transactionStatusDescription) {
            this.transactionStatusDescription = transactionStatusDescription;
            return this;
        }

        public ErrorApiResponse build() {
            return new ErrorApiResponse(this);
        }
    }
}

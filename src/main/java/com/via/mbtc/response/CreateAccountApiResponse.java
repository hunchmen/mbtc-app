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
public class CreateAccountApiResponse extends ApiResponse {

    private Long customerNumber;


    private CreateAccountApiResponse() {
        // private constructor to enforce the use of the builder
    }

    public Long getCustomerNumber() {
        return customerNumber;
    }


    public static class Builder {

        private Long customerNumber;
        private int transactionStatusCode;
        private String transactionStatusDescription;

        public Builder customerNumber(Long customerNumber) {
            this.customerNumber = customerNumber;
            return this;
        }

        public Builder transactionStatusCode(Integer transactionStatusCode) {
            this.transactionStatusCode = transactionStatusCode;
            return this;
        }

        public Builder transactionStatusDescription(String transactionStatusDescription) {
            this.transactionStatusDescription = transactionStatusDescription;
            return this;
        }

        public CreateAccountApiResponse build() {
            CreateAccountApiResponse response = new CreateAccountApiResponse();
            response.customerNumber = this.customerNumber;
            response.setTransactionStatusCode(this.transactionStatusCode);
            response.setTransactionStatusDescription(this.transactionStatusDescription);
            return response;
        }
    }
}

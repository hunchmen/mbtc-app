/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2024. All Rights Reserved.
 * 
 */
package com.via.mbtc.response;

import java.util.List;
import com.via.mbtc.model.Saving;

/**
 * @author valalberto
 * @date 25 Jan 2024
 * @version 1.0
 */
public class AccountFoundApiResponse extends ApiResponse {

    private Long customerNumber;
    private String customerName;
    private String customerMobile;
    private String customerEmail;
    private String address1;
    private String address2;
    private List<Saving> savings;

    private AccountFoundApiResponse() {

    }

    /**
     * @return the customerNumber
     */
    public Long getCustomerNumber() {
        return customerNumber;
    }

    /**
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @return the customerMobile
     */
    public String getCustomerMobile() {
        return customerMobile;
    }

    /**
     * @return the customerEmail
     */
    public String getCustomerEmail() {
        return customerEmail;
    }

    /**
     * @return the address1
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * @return the address2
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * @return the savings
     */
    public List<Saving> getSavings() {
        return savings;
    }

    public static class Builder {
        private Long customerNumber;
        private String customerName;
        private String customerMobile;
        private String customerEmail;
        private String address1;
        private String address2;
        private List<Saving> savings;
        private int transactionStatusCode;
        private String transactionStatusDescription;

        public Builder customerNumber(Long customerNumber) {
            this.customerNumber = customerNumber;
            return this;
        }

        public Builder customerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public Builder customerMobile(String customerMobile) {
            this.customerMobile = customerMobile;
            return this;
        }

        public Builder customerEmail(String customerEmail) {
            this.customerEmail = customerEmail;
            return this;
        }

        public Builder address1(String address1) {
            this.address1 = address1;
            return this;
        }

        public Builder address2(String address2) {
            this.address2 = address2;
            return this;
        }

        public Builder savings(List<Saving> savings) {
            this.savings = savings;
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

        public AccountFoundApiResponse build() {
            AccountFoundApiResponse response = new AccountFoundApiResponse();
            response.customerNumber = this.customerNumber;
            response.customerName = this.customerName;
            response.customerMobile = this.customerMobile;
            response.customerEmail = this.customerEmail;
            response.address1 = this.address1;
            response.address2 = this.address2;
            response.savings = this.savings;
            response.setTransactionStatusCode(this.transactionStatusCode);
            response.setTransactionStatusDescription(this.transactionStatusDescription);
            return response;
        }
    }


    @Override
    public String toString() {
        return "AccountFoundApiResponse{" + "customerNumber=" + customerNumber + ", customerName='"
                + customerName + '\'' + ", customerMobile='" + customerMobile + '\''
                + ", customerEmail='" + customerEmail + '\'' + ", address1='" + address1 + '\''
                + ", address2='" + address2 + '\'' + ", savings=" + savings
                + ", transactionStatusCode=" + getTransactionStatusCode()
                + ", transactionStatusDescription='" + getTransactionStatusDescription() + '\''
                + '}';
    }

}

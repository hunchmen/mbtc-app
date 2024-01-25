/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2024. All Rights Reserved.
 * 
 */
package com.via.mbtc.dto;

import java.util.List;
import com.via.mbtc.model.Saving;

/**
 * @author valalberto
 * @date 25 Jan 2024
 * @version 1.0
 */
public class AccountDTO {

    private Long customerNumber;

    private String customerName;

    private String customerMobile;

    private String customerEmail;

    private String address1;

    private String address2;

    private List<Saving> savings;

    public AccountDTO() {}

    public AccountDTO(Long customerNumber, String customerName, String customerMobile,
            String customerEmail, String address1, String address2, List<Saving> savings) {
        this.customerNumber = customerNumber;
        this.customerName = customerName;
        this.customerMobile = customerMobile;
        this.customerEmail = customerEmail;
        this.address1 = address1;
        this.address2 = address2;
        this.savings = savings;
    }

    public Long getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(Long customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerMobile() {
        return customerMobile;
    }

    public void setCustomerMobile(String customerMobile) {
        this.customerMobile = customerMobile;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public List<Saving> getSavings() {
        return savings;
    }

    public void setSavings(List<Saving> savings) {
        this.savings = savings;
    }
}

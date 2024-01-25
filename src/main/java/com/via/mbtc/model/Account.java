/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2024. All Rights Reserved.
 * 
 */
package com.via.mbtc.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author valalberto
 * @date 25 Jan 2024
 * @version 1.0
 */
@Entity
@Table(name = "accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_number", length = 8)
    private Long customerNumber;

    @Column(name = "customer_name", length = 50)
    private String customerName;

    @Column(name = "customer_mobile", length = 20)
    private String customerMobile;

    @Column(name = "customer_email", length = 50)
    private String customerEmail;

    @Column(name = "address1", length = 100)
    private String address1;

    @Column(name = "address2", length = 100)
    private String address2;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Saving> savings;

    public Account() {}

    public Account(Long customerNumber, String customerName, String customerMobile,
            String customerEmail, String address1, String address2, List<Saving> savings) {
        this.customerNumber = customerNumber;
        this.customerName = customerName;
        this.customerMobile = customerMobile;
        this.customerEmail = customerEmail;
        this.address1 = address1;
        this.address2 = address2;
        this.savings = savings;

        for (Saving saving : savings) {
            saving.setAccount(this);
        }
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

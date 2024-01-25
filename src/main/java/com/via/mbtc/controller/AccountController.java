/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2024. All Rights Reserved.
 * 
 */
package com.via.mbtc.controller;

import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.via.mbtc.constant.MessageConstant;
import com.via.mbtc.dto.AccountDTO;
import com.via.mbtc.response.AccountFoundApiResponse;
import com.via.mbtc.response.ApiResponse;
import com.via.mbtc.response.CreateAccountApiResponse;
import com.via.mbtc.response.ErrorApiResponse;
import com.via.mbtc.service.AccountService;

/**
 * @author valalberto
 * @date 25 Jan 2024
 * @version 1.0
 */
@RestController
@RequestMapping("/api/v1/account")
public class AccountController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountController.class);

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    public ResponseEntity<ApiResponse> createAccount(@Valid @RequestBody AccountDTO accountDTO) {

        LOGGER.info("START: {} - createAccount()", AccountController.class);

        if (accountDTO == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        if (accountDTO.getCustomerEmail() == null || accountDTO.getCustomerEmail().isEmpty()) {

            LOGGER.info("Email is null/empty.");

            ErrorApiResponse errorResponse = new ErrorApiResponse.Builder()
                    .transactionStatusCode(HttpStatus.BAD_REQUEST.value())
                    .transactionStatusDescription(MessageConstant.EMAIL_IS_REQUIRED).build();

            return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);

        }

        // create the account
        AccountDTO createdAccount = accountService.createAccount(accountDTO);

        CreateAccountApiResponse createResponse = new CreateAccountApiResponse.Builder()
                .customerNumber(createdAccount.getCustomerNumber())
                .transactionStatusCode(HttpStatus.CREATED.value())
                .transactionStatusDescription(MessageConstant.TRANSACTION_ACCOUNT_CREATED).build();


        LOGGER.debug("Successfully saved account with ID: {}", createdAccount.getCustomerNumber());

        return new ResponseEntity<>(createResponse, HttpStatus.CREATED);
    }

    @GetMapping("{customerNumber}")
    public ResponseEntity<ApiResponse> getMethodName(@PathVariable Long customerNumber) {


        AccountDTO account = accountService.getAccountByCustomerNumber(customerNumber);

        if (account == null) {

            ErrorApiResponse errorResponse = new ErrorApiResponse.Builder()
                    .transactionStatusCode(HttpStatus.BAD_REQUEST.value())
                    .transactionStatusDescription(MessageConstant.ACCOUNT_NOT_FOUND).build();

            return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
        }

        AccountFoundApiResponse response = new AccountFoundApiResponse.Builder()
                .customerNumber(account.getCustomerNumber()).customerName(account.getCustomerName())
                .customerMobile(account.getCustomerMobile())
                .customerEmail(account.getCustomerEmail()).address1(account.getAddress1())
                .address2(account.getAddress2()).transactionStatusCode(HttpStatus.FOUND.value())
                .transactionStatusDescription(MessageConstant.ACCOUNT_FOUND).build();

        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }

}

/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2024. All Rights Reserved.
 * 
 */
package com.via.mbtc.mapper;

import com.via.mbtc.dto.AccountDTO;
import com.via.mbtc.model.Account;

/**
 * @author valalberto
 * @date 25 Jan 2024
 * @version 1.0
 */
public class AccountMapper {

    private AccountMapper() {

    }

    public static AccountDTO mapToAccountDTO(Account createdAccount) {
        return new AccountDTO(createdAccount.getCustomerNumber(), createdAccount.getCustomerName(),
                createdAccount.getCustomerMobile(), createdAccount.getCustomerEmail(),
                createdAccount.getAddress1(), createdAccount.getAddress2(),
                createdAccount.getSavings());
    }

    public static Account mapToAccount(AccountDTO accountDTO) {
        return new Account(accountDTO.getCustomerNumber(), accountDTO.getCustomerName(),
                accountDTO.getCustomerMobile(), accountDTO.getCustomerEmail(),
                accountDTO.getAddress1(), accountDTO.getAddress2(), accountDTO.getSavings());
    }

}

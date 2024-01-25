/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2024. All Rights Reserved.
 * 
 */
package com.via.mbtc.service;

import javax.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import com.via.mbtc.constant.MessageConstant;
import com.via.mbtc.dto.AccountDTO;
import com.via.mbtc.mapper.AccountMapper;
import com.via.mbtc.model.Account;
import com.via.mbtc.repository.AccountRepository;

/**
 * @author valalberto
 * @date 25 Jan 2024
 * @version 1.0
 */
@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public AccountDTO createAccount(AccountDTO accountDTO) {

        Account account = AccountMapper.mapToAccount(accountDTO);
        Account createdAccount = accountRepository.save(account);


        return AccountMapper.mapToAccountDTO(createdAccount);


    }

    public AccountDTO getAccountByCustomerNumber(Long customerNumber) {


        Account account = accountRepository.findById(customerNumber)
                .orElseThrow(() -> new EntityNotFoundException(MessageConstant.ACCOUNT_NOT_FOUND));

        return AccountMapper.mapToAccountDTO(account);
    }
}

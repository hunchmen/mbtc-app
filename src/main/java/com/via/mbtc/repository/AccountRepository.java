/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2024. All Rights Reserved.
 * 
 */
package com.via.mbtc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.via.mbtc.model.Account;

/**
 * @author valalberto
 * @date 25 Jan 2024
 * @version 1.0
 */
public interface AccountRepository extends JpaRepository<Account, Long> {

}

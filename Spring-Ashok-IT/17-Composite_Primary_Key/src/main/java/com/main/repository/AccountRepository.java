package com.main.repository;

import com.main.entity.Account;
import com.main.entity.AccountPk;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, AccountPk> {

}
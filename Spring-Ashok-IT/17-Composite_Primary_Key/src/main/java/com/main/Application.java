package com.main;

import com.main.entity.Account;
import com.main.entity.AccountPk;
import com.main.repository.AccountRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

        AccountRepository accountRepository = context.getBean(AccountRepository.class);

        AccountPk accountPk = new AccountPk();
        accountPk.setAccId(124);
        accountPk.setAccNum(21514L);
        accountPk.setAccType("Salary");

        Account account = new Account();
        account.setBranh("MH");
        account.setHolderName("Om");
        account.setAccountPk(accountPk);

//        accountRepository.save(account);

        Optional<Account> findById = accountRepository.findById(accountPk);
        System.out.println(findById.get());
    }
}

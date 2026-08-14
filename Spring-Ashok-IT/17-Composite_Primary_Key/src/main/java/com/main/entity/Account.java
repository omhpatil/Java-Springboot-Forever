package com.main.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Account {

    private String holderName;
    private String branh;

    @EmbeddedId
    private AccountPk accountPk;

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getBranh() {
        return branh;
    }

    public void setBranh(String branh) {
        this.branh = branh;
    }

    public AccountPk getAccountPk() {
        return accountPk;
    }

    public void setAccountPk(AccountPk accountPk) {
        this.accountPk = accountPk;
    }

    @Override
    public String toString() {
        return "Account{" +
                "holderName='" + holderName + '\'' +
                ", branh='" + branh + '\'' +
                ", accountPk=" + accountPk +
                '}';
    }
}

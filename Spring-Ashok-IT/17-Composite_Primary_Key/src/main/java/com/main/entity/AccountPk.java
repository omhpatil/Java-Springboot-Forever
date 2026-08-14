package com.main.entity;


import jakarta.persistence.*;

import java.io.Serializable;

@Embeddable
public class AccountPk implements Serializable {

    private Integer accId;
    private String accType;
    private Long accNum;

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public Integer getAccId() {
        return accId;
    }

    public void setAccId(Integer accId) {
        this.accId = accId;
    }

    public Long getAccNum() {
        return accNum;
    }

    public void setAccNum(Long accNum) {
        this.accNum = accNum;
    }

}
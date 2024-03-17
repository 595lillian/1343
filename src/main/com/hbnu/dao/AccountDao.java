package com.hbnu.dao;

public class AccountDao {

    private String account;

    public String getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return "AccountDao{" +
                "account='" + account + '\'' +
                '}';
    }

    public void setAccount(String account) {
        this.account = account;
    }
}

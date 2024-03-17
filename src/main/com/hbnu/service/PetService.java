package com.hbnu.service;

import com.hbnu.dao.AccountDao;
import com.hbnu.dao.ItemDao;

public class PetService {

    private AccountDao accountDao;
    private ItemDao itemDao;

    @Override
    public String toString() {
        return "PetService{" +
                "accountDao=" + accountDao +
                ", itemDao=" + itemDao +
                '}';
    }

    public AccountDao getAccountDao() {
        return accountDao;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public ItemDao getItemDao() {
        return itemDao;
    }

    public void setItemDao(ItemDao itemDao) {
        this.itemDao = itemDao;
    }
}

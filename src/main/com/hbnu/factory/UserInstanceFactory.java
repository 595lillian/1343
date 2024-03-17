package com.hbnu.factory;

import com.hbnu.dao.UserDao;

public class UserInstanceFactory {
    public UserDao createInstance(){
        return new UserDao();
    }
}

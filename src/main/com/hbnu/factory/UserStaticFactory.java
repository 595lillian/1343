package com.hbnu.factory;

import com.hbnu.dao.UserDao;

public class UserStaticFactory {
    private static UserDao userDao = new UserDao();
    public static UserDao createInstance(){return userDao;}
}

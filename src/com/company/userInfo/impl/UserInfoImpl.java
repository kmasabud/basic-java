package com.company.userInfo.impl;

import com.company.userInfo.UserInfo;

public class UserInfoImpl implements UserInfo {
    @Override
    public String insertName(String name) {
        System.out.println("name is "+name);
        return "001";
    }

    @Override
    public String getName(String id) {
        System.out.println("id is "+id);
        return "Earth";
    }

    @Override
    public void updateName(String id, String name) {
        System.out.println("id is "+id);
        System.out.println("name is "+name);
        System.out.println("update done.");
    }

    @Override
    public void deleteName(String id) {
        System.out.println("id is "+id);
        System.out.println("delete done.");
    }
}

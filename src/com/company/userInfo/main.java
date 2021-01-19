package com.company.userInfo;

import com.company.userInfo.impl.UserInfoImpl;

public class main {
    public static void main(String... args){
        UserInfo user = new UserInfoImpl();
        String id = user.insertName("A");
        user.getName(id);
        user.updateName(id, "B");
        user.getName(id);
        user.deleteName(id);
    }
}

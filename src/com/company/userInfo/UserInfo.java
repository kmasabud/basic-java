package com.company.userInfo;

public interface UserInfo {
    String insertName(String name);
    String getName(String id);
    void updateName(String id, String name);
    void deleteName(String id);
}
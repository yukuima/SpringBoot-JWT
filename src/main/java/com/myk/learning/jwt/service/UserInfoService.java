package com.myk.learning.jwt.service;


import com.myk.learning.jwt.model.UserInfo;

public interface UserInfoService {
    /**
     * 通过username查找用户信息;
     */
    UserInfo findByUsername(String username);

    UserInfo findByUsernameAndPassword(String username, String password);

    boolean updateById(UserInfo userInfo);

    /**
     * 注册用户
     *
     * @param userInfo
     * @return
     */
    boolean registerUserInfo(UserInfo userInfo);

}
package com.mybatis.test.dao;


import com.mybatis.test.pojo.User;

public interface IUserDao {

    User queryUserInfoById(long uId);

}

package com.yidong.mapper;

import com.yidong.model.User;

import java.util.HashMap;

public interface UserMapper {
    int login(HashMap<String,String> map);

    User selectByAccount(String account);

    int insert(User user);

    User selectByPrimaryKey(String id);

    int updatePasswordByAccount(HashMap<String,String> map);

}
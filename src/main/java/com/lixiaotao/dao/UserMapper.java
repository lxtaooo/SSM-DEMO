package com.lixiaotao.dao;

import com.lixiaotao.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectUser();
    User selectUserById(int id);
    boolean deleteUser(int id);
    boolean updateUser(User user);
    int selectMax();
    boolean addUser(User user);
    User selectUserByName(String name);
}

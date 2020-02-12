package com.lixiaotao.service;

import com.lixiaotao.pojo.User;

import java.util.List;

public interface UserService {
    List<User> selectUser();
    boolean deleteUser(int id );
    boolean updateUser(User user);
    User selectUserById(int id);
    int selectMax();
    boolean addUser(User user);
    User selectUserByName(String name);
}

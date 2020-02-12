package com.lixiaotao.service;

import com.lixiaotao.dao.UserMapper;
import com.lixiaotao.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class UserServiceImpl implements  UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> selectUser() {
        return userMapper.selectUser();
    }

    public boolean deleteUser(int id) {
        return userMapper.deleteUser(id);
    }

    public boolean updateUser(User user) {
        return userMapper.updateUser(user);
    }

    public User selectUserById(int id) {
        return userMapper.selectUserById(id);
    }

    public int selectMax() {

        return userMapper.selectMax();
    }

    public boolean addUser(User user) {
        return userMapper.addUser(user);
    }

    public User selectUserByName(String name) {
        return userMapper.selectUserByName(name);
    }
}

package com.lixiaotao.controller;

import com.lixiaotao.pojo.User;
import com.lixiaotao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.management.openmbean.ArrayType;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("/findAll")
    public String user(Model model){
        List<User> users = userService.selectUser();
        model.addAttribute("msg",users);
        return "user";
    }

    @RequestMapping("/del/{id}")
    public String deleteUser(@PathVariable int id){
        userService.deleteUser(id);
        return "redirect:/user/findAll";
    }
    @RequestMapping("/findById/{id}")
    public String selectUserById(@PathVariable  int id,Model model){
        User user = userService.selectUserById(id);
        model.addAttribute("msg",user);
        return "update";
    }
    @RequestMapping("/update")
    public String update(User user){
        userService.updateUser(user);
        return "redirect:/user/findAll";
    }

    @RequestMapping("/adduser")
    public String addUser(Model model){
        int i = userService.selectMax();
        i++;
        model.addAttribute("msg",i);
        return "adduser";
    }

    @RequestMapping("/addUser")
    public String addUser1(User user){
       userService.addUser(user);
        return "redirect:/user/findAll";
    }
    @RequestMapping("/findUser")
    public String findUser(String name,Model model){
        User user = userService.selectUserByName(name);
        List<User>  list = new ArrayList<User>();
        list.add(user);
        if(user==null){
            list = userService.selectUser();
            model.addAttribute("error","未查到");
        }
        model.addAttribute("msg",list);
        return "user";
    }

}

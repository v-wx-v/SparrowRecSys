package com.wzhe.sparrowrecsys.online.controller;


import com.wzhe.sparrowrecsys.online.datamanager.DataManager;
import com.wzhe.sparrowrecsys.online.datamanager.Movie;
import com.wzhe.sparrowrecsys.online.datamanager.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  User Controller
 * </p>
 *
 * @author wxx
 */
@RestController
@RequestMapping("/")
public class UserController {

    @GetMapping("/getuser")
    public Object getById(Integer id) {

        //get user object from DataManager
        User user = DataManager.getInstance().getUserById(id);
        if (user == null){
            return "";
        }
        return user;
    }
}

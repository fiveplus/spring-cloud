package com.fiveplus.controller;

import com.fiveplus.entity.User;
import com.fiveplus.service.UserService;
import com.fiveplus.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/list.json")
    public @ResponseBody Result list(){
        List<User> list =  userService.queryAll();
        Result result = new Result(0, list);
        return result;
    }

}

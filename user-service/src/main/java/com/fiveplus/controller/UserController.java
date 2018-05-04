package com.fiveplus.controller;

import com.fiveplus.api.user.UserAPI;
import com.fiveplus.api.util.Result;
import com.fiveplus.entity.User;
import com.fiveplus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController implements UserAPI {
    @Autowired
    private UserService userService;

    @Override
    public @ResponseBody Result list(){
        List<User> list =  userService.queryAll();
        Result result = new Result(0, list);
        return result;
    }

}

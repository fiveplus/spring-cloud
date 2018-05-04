package com.fiveplus.controller;

import com.fiveplus.api.test.TestAPI;
import com.fiveplus.api.util.Result;
import com.fiveplus.user.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TestController implements TestAPI {

    @Autowired
    private UserFeign userFeign;

    @Override
    public Result test(){
        Result result = userFeign.list();
        return result;
    }



}

package com.fiveplus.api.user;


import com.fiveplus.api.util.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 提供服务接口，服务方和服务调用方分别继承
 */

@RequestMapping("/user")
public interface UserAPI {

    @RequestMapping("/list.json")
    @ResponseBody Result list();

}

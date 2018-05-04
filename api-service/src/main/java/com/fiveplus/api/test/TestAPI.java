package com.fiveplus.api.test;

import com.fiveplus.api.util.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/test")
public interface TestAPI {
    @RequestMapping("/test.json")
    @ResponseBody Result test();
}

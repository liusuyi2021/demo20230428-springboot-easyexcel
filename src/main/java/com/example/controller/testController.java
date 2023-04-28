package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: testController
 * @Description:
 * @Author: 刘苏义
 * @Date: 2023年04月28日16:47
 * @Version: 1.0
 **/
@RestController
public class testController {
    @RequestMapping("/")
    public Integer test()
    {
        Integer x=5;
        Integer y=0;
        return x/y;
    }
}

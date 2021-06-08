package com.yang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TangYuan
 * @create 2021--06--05--16:27
 * @description
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String helloWorld(){
        return "hello,spring boot";
    }
}

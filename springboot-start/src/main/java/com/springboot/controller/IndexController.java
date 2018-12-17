package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ZzzLJ
 * @Description:
 */
//@ResponseBody
//@Controller
@RestController
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

}

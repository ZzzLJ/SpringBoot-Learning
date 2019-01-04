package com.springboot.thymeleaf_freemarker.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HtmlController {
    @RequestMapping("templates/html")
    public String html(){
        return "html/html";
    }
}

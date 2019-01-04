package com.springboot.thymeleaf_freemarker.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FreemarkerController {

    @RequestMapping("freemarker")
    public String test(Model model){
        model.addAttribute("name", "ZzzLJ");
        return "freemarker";
    }

}

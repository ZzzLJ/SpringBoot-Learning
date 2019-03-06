package com.springbootmybatis_plus.controller;

import com.springbootmybatis_plus.entity.SysDepartment;
import com.springbootmybatis_plus.service.ISysDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author ZzzLJ
 * @Description
 */
@Controller
@RequestMapping("/test/sys-department")
public class SysDepartmentController {
    @Autowired
    private ISysDepartmentService departmentService;

    @ResponseBody
    @RequestMapping
    public List<SysDepartment> test(){
        return departmentService.list(null);
    }
}

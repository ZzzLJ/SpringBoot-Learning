package com.springbootglobal_exception_handle.controller;

import com.springbootglobal_exception_handle.bean.ResponseMap;
import com.springbootglobal_exception_handle.bean.ExceptionEnum;
import com.springbootglobal_exception_handle.exception.CustomException1;
import com.springbootglobal_exception_handle.exception.ServiceLogicException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import javax.servlet.http.HttpServletRequest;

/**
 * @Author: ZzzLJ
 */
@Controller
@RequestMapping("/exception")
public class ExceptionController {
    private static final Logger logger = LoggerFactory.getLogger(ExceptionController.class);

    @RequestMapping("/handler1")
    public void handler1() {
        throw new ServiceLogicException(ExceptionEnum.SERVICELOGICEXCEPTION);
    }

    @RequestMapping("/handler2")
    public void handler2() {
        throw new CustomException1(ExceptionEnum.CUSTOMEXCEPTION1);
    }

    @ExceptionHandler(CustomException1.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseMap handle(HttpServletRequest request, Exception exception) {
        return new ResponseMap().buildFailResponse().append("url",request.getRequestURL()).append("exception",exception.getMessage());
    }
}

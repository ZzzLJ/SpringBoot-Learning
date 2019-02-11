package com.springbootglobal_exception_handle.controller;

import com.springbootglobal_exception_handle.exception.CustomException1;
import com.springbootglobal_exception_handle.exception.ServiceLogicException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/*
* 自定义全局异常处理的一种方式，把异常的信息显示到前端页面，有待改进
* */
@Component      //需要带上此注解
public class CustomizeExceptionResolver implements HandlerExceptionResolver,Ordered {
    private static final Logger logger = LoggerFactory.getLogger(CustomizeExceptionResolver.class);

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object object, Exception exception) {
        logger.info("CustomizeExceptionResolver......");
        exception.printStackTrace();
        String message = exception.getMessage();
        ModelAndView modelAndView = new ModelAndView();
        if (exception instanceof ServiceLogicException) {
            printMessage(response, message + "CustomizeExceptionResolver");
            //根据不同异常做不同的操作
            ModelMap modelMap = new ModelMap();
            modelMap.addAttribute("mapmessage", message);
            modelAndView.addAllObjects(modelMap);
            modelAndView.addObject("message", message);
        } else if (exception instanceof CustomException1) {
            printMessage(response, exception.getMessage() + "CustomizeExceptionResolver");
            //根据不同的异常做不同的操作
        } else {
            printMessage(response, exception.getMessage() + "CustomizeExceptionResolver");
        }
        return modelAndView;
    }

    public void printMessage(HttpServletResponse response, String message) {
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");
        try {
            PrintWriter printWriter = response.getWriter();
            printWriter.write("{\"message\":\"" + message + "\"}");
            printWriter.flush();
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    * 设置自定义异常处理优先级
    * HIGHEST_PRECEDENCE：该优先级覆盖
    * LOWEST_PRECEDENCE：
    * */
    @Override
    public int getOrder() {
        return Ordered.HIGHEST_PRECEDENCE;
    }
}

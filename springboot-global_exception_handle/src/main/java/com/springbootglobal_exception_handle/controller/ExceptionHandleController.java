package com.springbootglobal_exception_handle.controller;

import com.springbootglobal_exception_handle.bean.ResponseMap;
import com.springbootglobal_exception_handle.exception.ServiceLogicException;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

/**
 *  @ControllerAdvice
 *  @ExceptionHandler 配置对全局异常进行处理
 *  根据异常处理器的配置顺序依次尝试异常匹配和处理
 */
@ControllerAdvice
public class ExceptionHandleController {
    //未符合com.system.web.vo.*   @NotNull @Pattern等检验注解，进入这里处理
    @ExceptionHandler({ BindException.class, MethodArgumentNotValidException.class })
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseMap beanParamInvalidHandle(BindingResult result) {
        //System.out.println("beanParamInvalidHandle");
        List<FieldError> fieldErrors = result.getFieldErrors();
        ResponseMap fieldErrorDataMap = new ResponseMap().buildFailResponse();
        for (FieldError error : fieldErrors) {
            //System.out.println(error.getField() + "Error     " + error.getDefaultMessage());
            fieldErrorDataMap.put(error.getField() + "Error", error.getDefaultMessage());
        }
        return fieldErrorDataMap;
    }

    @ExceptionHandler(ServiceLogicException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseMap serviceLogicExceptionHandler(ServiceLogicException exception){
        //System.out.println("serviceLogicExceptionHandler");
        ResponseMap errorData = new ResponseMap().buildFailResponse().buildFailResponse();
        errorData.append("message", exception.getMessage());
        return errorData;
    }
}

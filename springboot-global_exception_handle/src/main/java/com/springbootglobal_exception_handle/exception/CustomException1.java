package com.springbootglobal_exception_handle.exception;

import com.springbootglobal_exception_handle.bean.ExceptionEnum;

/**
 * @Author: ZzzLJ
 */
public class CustomException1 extends RuntimeException {
    private Integer code;

    public CustomException1(Integer code,String message) {
        super(message);
        this.code = code;
    }

    public CustomException1(ExceptionEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }
}
package com.springbootglobal_exception_handle.bean;

public enum ExceptionEnum {
    CUSTOMEXCEPTION1(1,"CustomException1"),
    SERVICELOGICEXCEPTION(2,"ServiceLogicException");

    private Integer code;
    private String message;

    ExceptionEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}

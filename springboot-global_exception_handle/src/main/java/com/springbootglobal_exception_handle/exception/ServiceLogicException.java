package com.springbootglobal_exception_handle.exception;

import com.springbootglobal_exception_handle.bean.ExceptionEnum;

/*
* 自定义业务处理逻辑异常，返回异常信息到前端页面
* */
public class ServiceLogicException extends RuntimeException {
    private Integer code;

	public ServiceLogicException(Integer code,String message) {
		super(message);
		this.code = code;
	}

    public ServiceLogicException(ExceptionEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }
}

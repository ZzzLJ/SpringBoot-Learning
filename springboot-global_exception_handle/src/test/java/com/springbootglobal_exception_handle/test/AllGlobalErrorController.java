package com.springbootglobal_exception_handle.test;

import org.springframework.boot.web.servlet.error.ErrorController;

/**
 * @Author: ZzzLJ
 */
public class AllGlobalErrorController implements ErrorController {
    @Override
    public String getErrorPath() {
        return null;
    }
}

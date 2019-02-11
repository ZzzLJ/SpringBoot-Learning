package com.springbootglobal_exception_handle.bean;

import java.util.HashMap;

/**
 * @Author: ZzzLJ
 * @Description:
 */
public class ResponseMap extends HashMap<String, Object> {
    public ResponseMap buildSuccessResponse() {
        this.put("result", true);
        return this;
    }

    public ResponseMap buildFailResponse() {
        this.put("result", false);
        return this;
    }

    public ResponseMap append(String key, Object value) {
        this.put(key, value);
        return this;
    }
}

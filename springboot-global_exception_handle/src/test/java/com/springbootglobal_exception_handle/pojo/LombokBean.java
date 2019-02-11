package com.springbootglobal_exception_handle.pojo;

import lombok.Builder;
import lombok.Data;
import lombok.val;

import java.util.ArrayList;
import java.util.Date;

/**
 * @Author: ZzzLJ
 */
@Data
@Builder
public class LombokBean {
    private Integer number;

    private String str;

    private Date date;

    private Boolean val;

    private boolean vall;
}

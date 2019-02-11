package com.springbootglobal_exception_handle.test;

import com.springbootglobal_exception_handle.pojo.LombokBean;
import lombok.val;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Date;

/**
 * @Author: ZzzLJ
 */
public class LombokTest {
    @Test
    public void test1(){
        /*LombokBean lombokBean = new LombokBean();
        lombokBean.setDate(new Date());
        lombokBean.setStr("123");
        lombokBean.setNumber(1);
        lombokBean.setVal(true);
        System.out.println(lombokBean.getVal());
        lombokBean.setVall(false);
        System.out.println(lombokBean.isVall());
        System.out.println(lombokBean);*/
    }

    @Test
    public void test2(){
        LombokBean lombokBean= LombokBean.builder().date(new Date())
                .number(1)
                .str("1")
                .val(true)
                .build();
        System.out.println(lombokBean);
    }
}

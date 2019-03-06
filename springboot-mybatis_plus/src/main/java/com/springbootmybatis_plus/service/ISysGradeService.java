package com.springbootmybatis_plus.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.springbootmybatis_plus.entity.SysGrade;

import java.util.List;

/**
 * @author ZzzLJ
 * @Description
 */
public interface ISysGradeService extends IService<SysGrade> {
    //覆盖Mybatis Plus 方法
    /*@Override
    List<SysGrade> list(Wrapper<SysGrade> wrapper);*/
}

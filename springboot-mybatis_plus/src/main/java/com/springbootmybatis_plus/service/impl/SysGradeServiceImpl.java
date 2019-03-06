package com.springbootmybatis_plus.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springbootmybatis_plus.entity.SysGrade;
import com.springbootmybatis_plus.mapper.SysGradeMapper;
import com.springbootmybatis_plus.service.ISysGradeService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZzzLJ
 * @Description
 */
@Service
public class SysGradeServiceImpl extends ServiceImpl<SysGradeMapper, SysGrade> implements ISysGradeService {
    /*@Override
    public List<SysGrade> list(Wrapper<SysGrade> wrapper){
        return null;
    }*/
}

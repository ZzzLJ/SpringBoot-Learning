package com.springbootmybatis_plus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springbootmybatis_plus.entity.SysDepartment;
import com.springbootmybatis_plus.mapper.SysDepartmentMapper;
import com.springbootmybatis_plus.service.ISysDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZzzLJ
 * @Description
 */
@Service
public class SysDepartmentServiceImpl extends ServiceImpl<SysDepartmentMapper, SysDepartment> implements ISysDepartmentService {
    @Autowired
    private SysDepartmentMapper departmentMapper;

    @Override
    public List<SysDepartment> queryAll() {
        return departmentMapper.selectList(null);
    }
}

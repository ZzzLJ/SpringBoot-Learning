package com.wyu.test.service.impl;

import com.wyu.test.po.Department;
import com.wyu.test.mapper.DepartmentMapper;
import com.wyu.test.service.IDepartmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author ZzzLJ
 * @Description
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements IDepartmentService {

}

package com.springbootmybatis_plus.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.springbootmybatis_plus.entity.SysDepartment;

import java.util.List;

/**
 * @author ZzzLJ
 * @Description
 */
public interface ISysDepartmentService extends IService<SysDepartment> {
    List<SysDepartment> queryAll();
}

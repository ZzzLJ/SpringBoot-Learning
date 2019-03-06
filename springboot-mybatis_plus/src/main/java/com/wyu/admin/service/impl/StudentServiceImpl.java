package com.wyu.admin.service.impl;

import com.wyu.admin.po.Student;
import com.wyu.admin.mapper.StudentMapper;
import com.wyu.admin.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author ZzzLJ
 * @Description
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

}

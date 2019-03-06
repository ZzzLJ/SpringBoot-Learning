package com.wyu.system.service.impl;

import com.wyu.system.po.Student;
import com.wyu.system.mapper.StudentMapper;
import com.wyu.system.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author ZzzLJ
 * @Description
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

}

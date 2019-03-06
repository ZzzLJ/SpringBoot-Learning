package com.wyu.test.service.impl;

import com.wyu.test.po.Student;
import com.wyu.test.mapper.StudentMapper;
import com.wyu.test.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author ZzzLJ
 * @Description
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

}

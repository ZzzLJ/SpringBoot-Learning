package com.wyu.test.service.impl;

import com.wyu.test.po.Course;
import com.wyu.test.mapper.CourseMapper;
import com.wyu.test.service.ICourseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author ZzzLJ
 * @Description
 */
@Service
public class CourseServiceImpl extends ServiceImpl<CourseMapper, Course> implements ICourseService {

}

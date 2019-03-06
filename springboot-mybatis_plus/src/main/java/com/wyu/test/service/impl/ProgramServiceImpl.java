package com.wyu.test.service.impl;

import com.wyu.test.po.Program;
import com.wyu.test.mapper.ProgramMapper;
import com.wyu.test.service.IProgramService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author ZzzLJ
 * @Description
 */
@Service
public class ProgramServiceImpl extends ServiceImpl<ProgramMapper, Program> implements IProgramService {

}

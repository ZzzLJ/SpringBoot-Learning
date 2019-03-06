package com.wyu.test.service.impl;

import com.wyu.test.po.LoginRecord;
import com.wyu.test.mapper.LoginRecordMapper;
import com.wyu.test.service.ILoginRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author ZzzLJ
 * @Description
 */
@Service
public class LoginRecordServiceImpl extends ServiceImpl<LoginRecordMapper, LoginRecord> implements ILoginRecordService {

}

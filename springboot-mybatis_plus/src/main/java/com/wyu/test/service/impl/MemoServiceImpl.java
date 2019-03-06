package com.wyu.test.service.impl;

import com.wyu.test.po.Memo;
import com.wyu.test.mapper.MemoMapper;
import com.wyu.test.service.IMemoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author ZzzLJ
 * @Description
 */
@Service
public class MemoServiceImpl extends ServiceImpl<MemoMapper, Memo> implements IMemoService {

}

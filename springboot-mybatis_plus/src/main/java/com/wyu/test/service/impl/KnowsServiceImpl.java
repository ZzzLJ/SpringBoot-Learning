package com.wyu.test.service.impl;

import com.wyu.test.po.Knows;
import com.wyu.test.mapper.KnowsMapper;
import com.wyu.test.service.IKnowsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author ZzzLJ
 * @Description
 */
@Service
public class KnowsServiceImpl extends ServiceImpl<KnowsMapper, Knows> implements IKnowsService {

}

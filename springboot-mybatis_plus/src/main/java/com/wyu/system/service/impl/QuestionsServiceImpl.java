package com.wyu.system.service.impl;

import com.wyu.system.po.Questions;
import com.wyu.system.mapper.QuestionsMapper;
import com.wyu.system.service.IQuestionsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author ZzzLJ
 * @Description
 */
@Service
public class QuestionsServiceImpl extends ServiceImpl<QuestionsMapper, Questions> implements IQuestionsService {

}

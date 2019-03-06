package com.wyu.test.service.impl;

import com.wyu.test.po.Questions;
import com.wyu.test.mapper.QuestionsMapper;
import com.wyu.test.service.IQuestionsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author ZzzLJ
 * @Description
 */
@Service
public class QuestionsServiceImpl extends ServiceImpl<QuestionsMapper, Questions> implements IQuestionsService {

}

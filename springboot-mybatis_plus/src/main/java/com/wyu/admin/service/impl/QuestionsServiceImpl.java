package com.wyu.admin.service.impl;

import com.wyu.admin.po.Questions;
import com.wyu.admin.mapper.QuestionsMapper;
import com.wyu.admin.service.IQuestionsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author ZzzLJ
 * @Description
 */
@Service
public class QuestionsServiceImpl extends ServiceImpl<QuestionsMapper, Questions> implements IQuestionsService {

}

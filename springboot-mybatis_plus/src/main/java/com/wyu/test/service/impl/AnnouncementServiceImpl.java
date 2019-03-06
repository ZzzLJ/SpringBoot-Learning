package com.wyu.test.service.impl;

import com.wyu.test.po.Announcement;
import com.wyu.test.mapper.AnnouncementMapper;
import com.wyu.test.service.IAnnouncementService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author ZzzLJ
 * @Description
 */
@Service
public class AnnouncementServiceImpl extends ServiceImpl<AnnouncementMapper, Announcement> implements IAnnouncementService {

}

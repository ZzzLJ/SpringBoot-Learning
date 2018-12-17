package com.springbootmybatis.dao;

import com.springbootmybatis.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AnnotationDaoTest {
    private static final Logger logger = LoggerFactory.getLogger(AnnotationDaoTest.class);

    @Autowired
    private AnnotationDao annotationDao;

    @Test
    public void insert() {
        User user = new User();
        user.setId(8L);
        user.setName("Zzzzz");
        user.setTime(new Date());
        int insert = annotationDao.insert(user);
        logger.info(insert + "");
    }


    @Test
    public void findUsers() {
        List<User> users = annotationDao.findUsers();
        for (User user : users) {
            logger.info(user.toString());
        }
    }
}
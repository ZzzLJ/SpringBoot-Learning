package com.springbootmybatis.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserControllerTest {
    @Autowired
    TestRestTemplate testRestTemplate;

    @LocalServerPort
    int port;

    private URL url;

    private static final Logger logger = LoggerFactory.getLogger(UserControllerTest.class);

    @Before
    public void before() throws MalformedURLException {
        url = new URL("http://localhost:" + port + "/user/");
    }

    @Test
    public void test(){
        String response = testRestTemplate.getForObject(url.toString() + "find", String.class);
        logger.info(response);
    }

}
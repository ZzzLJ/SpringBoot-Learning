package com.springbootglobal_exception_handle.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import java.net.MalformedURLException;
import java.net.URL;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ExceptionControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @LocalServerPort
    private int port;

    private URL url;

    @Before
    public void before() throws MalformedURLException {
        url = new URL("http://localhost:" + port + "/exception/");
    }

    @Test
    public void test1(){
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url.toString() + "handler1", String.class);
        System.out.println(responseEntity.getStatusCode());
        System.out.println(responseEntity.getBody());
    }

    @Test
    public void test2(){
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url.toString() + "handler2", String.class);
        System.out.println(responseEntity.getStatusCode());
        System.out.println(responseEntity.getBody());
    }
}
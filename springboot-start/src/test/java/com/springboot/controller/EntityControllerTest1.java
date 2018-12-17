package com.springboot.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.springboot.pojo.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

/**
 *  单元测试UserController
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class EntityControllerTest1 {
    @LocalServerPort
    private int port;

    private URL url;

    @Autowired
    private TestRestTemplate restTemplate;

    @Before
    public void before() throws MalformedURLException {
        url = new URL("http://localhost:" + port + "/users/");
    }

    //请求路径：http://localhost:8080/users/
    @Test
    public void getUsers(){
        ResponseEntity<String> response = restTemplate.getForEntity(url.toString(), String.class);
        //json字符串反序列化
        ArrayList<User> users = JSONObject.parseObject(response.getBody(), new TypeReference<ArrayList<User>>() {
        });
        //状态码
        System.out.println(response.getStatusCode());
        //获取json字符串
        System.out.println(response.getBody());
    }

    //请求路径：http://localhost:8080/users/1
    @Test
    public void findUserById() {
        ResponseEntity<String> response = restTemplate.getForEntity(url.toString() + "1", String.class);
        //json字符串
        String jsonStr = response.getBody();
        System.out.println(jsonStr);
        User user = JSON.parseObject(response.getBody(), User.class);
        System.out.println(user);
    }

    //请求路径：http://localhost:8080/users/create
    @Test
    public void createUser(){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add(HttpHeaders.ACCEPT, "application/json");
        User user = new User(6L, "ZzzLJ");
        HttpEntity<User> httpEntity = new HttpEntity<>(user, httpHeaders);
        ResponseEntity<String> response = restTemplate.exchange(url + "create", HttpMethod.POST, httpEntity, String.class);
        System.out.println(response.getBody());
        User user1 = JSON.parseObject(response.getBody(), User.class);
        System.out.println(user1);
    }

    //PUT请求，请求路径：http://localhost:8080/users/update
    @Test
    public void updateUser(){
        ResponseEntity<String> respBefore = restTemplate.getForEntity(url + "1", String.class);
        System.out.println(JSON.parseObject(respBefore.getBody(), User.class));

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add(HttpHeaders.ACCEPT, "application/json");
        User user = new User(1L, "ZzzLJ");
        HttpEntity<User> httpEntity = new HttpEntity<>(user, httpHeaders);
        ResponseEntity<String> response = restTemplate.exchange(url + "update", HttpMethod.PUT, httpEntity, String.class);
        System.out.println(response.getStatusCode());

        ResponseEntity<String> respAfter = restTemplate.getForEntity(url + "1", String.class);
        System.out.println(JSON.parseObject(respAfter.getBody(), User.class));
    }

    //DELETE请求，请求路径：http://localhost:8080/users/1
    @Test
    public void deleteByUserId(){
        restTemplate.delete(url + "1",String.class);
        ResponseEntity<String> response = restTemplate.getForEntity(url + "1", String.class);
        System.out.println(JSON.parseObject(response.getBody(), User.class));
    }

}

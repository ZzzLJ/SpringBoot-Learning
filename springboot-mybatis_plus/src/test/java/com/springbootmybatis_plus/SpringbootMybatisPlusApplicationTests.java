package com.springbootmybatis_plus;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.springbootmybatis_plus.entity.SysDepartment;
import com.springbootmybatis_plus.entity.SysGrade;
import com.springbootmybatis_plus.mapper.SysDepartmentMapper;
import com.springbootmybatis_plus.mapper.SysGradeMapper;
import com.springbootmybatis_plus.service.ISysDepartmentService;
import com.springbootmybatis_plus.service.ISysGradeService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringbootMybatisPlusApplicationTests {
    private static final Logger logger = LoggerFactory.getLogger(SpringbootMybatisPlusApplicationTests.class);

    @LocalServerPort
    private String port;

    @Autowired
    private TestRestTemplate testRestTemplate;

    private URI uri;

    @Autowired
    private ISysDepartmentService departmentService;

    @Autowired
    private ISysGradeService gradeService;

    @Autowired
    private SysDepartmentMapper departmentMapper;

    @Autowired
    private SysGradeMapper gradeMapper;

    @Before
    public void before() throws URISyntaxException {
        uri = new URI("http://localhost:" + port + "/test");
    }

    @Test
    public void test1(){
        ResponseEntity<String> forEntity = testRestTemplate.getForEntity(uri.toString() + "/sys-department", String.class);
        ArrayList<SysDepartment> sysDepartments = JSONObject.parseObject(forEntity.getBody(), new TypeReference<ArrayList<SysDepartment>>() {
        });
        sysDepartments.forEach(System.out::println);
        //状态码
        System.out.println(forEntity.getStatusCode());
        //获取json字符串
        System.out.println(forEntity.getBody());
    }

    @Test
    public void test2(){
        List<SysDepartment> sysDepartments = departmentMapper.selectList(null);
        sysDepartments.forEach(System.out::println);
    }

    /*
    * CRUD接口，参考：https://mp.baomidou.com/guide/crud-interface.html
    * */
    @Test
    public void test3(){

    }

    @Test
    public void test4(){
        //com.springbootmybatis_plus.config.MybatisPlusConfig  配置分页插件
        /*IPage<SysGrade> selectPage = gradeMapper.selectPage(
                new Page<SysGrade>(1, 3),
                new QueryWrapper<SysGrade>().eq("Major", "123456"));*/
        IPage<SysGrade> selectPage = gradeMapper.selectPage(
                new Page<SysGrade>(1, 3),
                null);
        List<SysGrade> userList = selectPage.getRecords();
        userList.forEach(System.out::println);
    }

    @Test
    public void test5(){

    }

    @Test
    public void test6(){

    }

    /*@Autowired
    public UserMapper userMapper;


    *//*
    * 基本CRUD
    * *//*
    @Test
    public void CRUD() {
        // 初始化影响行数
        int result = 0;

        // 初始化 User 对象
        User user = new User();
        // 插入 User (插入成功会自动回写主键到实体类)
        user.setName("ZzzLJ");
        result = userMapper.insert(user);
        logger.info("insert: " + result);
        logger.info("insert: " + user);

        // 更新 User
        *//*user.setAge(18);
        result = userMapper.updateById(user);*//*

        // 查询 User
        *//*User exampleUser = userMapper.selectById(user.getId());*//*

        // 查询姓名为‘张三’的所有用户记录
        List<User> userList = userMapper.selectList(
                new QueryWrapper<User>().eq("name", "ZzzLJ")
        );
        userList.forEach(System.out::println);
        // 删除 User
        *//*result = userMapper.deleteById(user.getId());*//*
    }

    *//*
    * 分页查询
    * Reference:https://mp.baomidou.com/guide/page.html
    * *//*
    @Test
    public void pagination(){
        //com.springbootmybatis_plus.config.MybatisPlusConfig  配置分页插件
        IPage<User> selectPage = userMapper.selectPage(
                new Page<User>(1, 3),
                new QueryWrapper<User>().eq("email", "test@baomidou.com"));
        List<User> userList = selectPage.getRecords();
        userList.forEach(System.out::println);
        System.out.println("================================");
    }

    *//*
    * mybatis plus会覆盖UserMapper里定义的同名方法
    * *//*
    @Test
    public void mybatis(){
        User user = new User();
        user.setEmail("ZzzLJ@gmail.com");
        user.setName("nicaiya");
        userMapper.insert(user);

        //TODO 无法调用
        User user1 = new User();
        user1.setId(123L);
        user1.setEmail("gmail.com");
        user1.setName("zzzz");
        userMapper.insertTest(user);
    }*/

}


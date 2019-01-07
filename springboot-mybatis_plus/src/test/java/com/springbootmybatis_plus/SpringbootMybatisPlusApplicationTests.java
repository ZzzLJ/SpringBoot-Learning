package com.springbootmybatis_plus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.springbootmybatis_plus.mapper.UserMapper;
import com.springbootmybatis_plus.model.User;
import com.sun.xml.internal.bind.v2.TODO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisPlusApplicationTests {
    private static final Logger logger = LoggerFactory.getLogger(SpringbootMybatisPlusApplicationTests.class);

    @Autowired
    public UserMapper userMapper;

	@Test
    public void mybatisPlus(){
	    //UserMapper 中的 selectList() 方法的参数为 MP 内置的条件封装器 Wrapper，所以不填写就是无任何条件
        //不需要配置XMl文件
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
        Assert.assertEquals(5,users.size());
    }

    /*
    * 基本CRUD
    * */
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
        /*user.setAge(18);
        result = userMapper.updateById(user);*/

        // 查询 User
        /*User exampleUser = userMapper.selectById(user.getId());*/

        // 查询姓名为‘张三’的所有用户记录
        List<User> userList = userMapper.selectList(
                new QueryWrapper<User>().eq("name", "ZzzLJ")
        );
        userList.forEach(System.out::println);
        // 删除 User
        /*result = userMapper.deleteById(user.getId());*/
    }

    /*
    * 分页查询
    * Reference:https://mp.baomidou.com/guide/page.html
    * */
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

    /*
    * mybatis plus会覆盖UserMapper里定义的同名方法
    * */
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
    }

}


package com.springboot.controller;

import com.springboot.controller.EntityController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.*;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

/**
 * @Author: ZzzLJ
 * 单元测试EntityController
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MockServletContext.class)
@WebAppConfiguration
public class EntityControllerTest2 {
    private MockMvc mockMvc;

    @Before
    public void setUp(){
        mockMvc = MockMvcBuilders.standaloneSetup(new EntityController()).build();
    }

    @Test
    public void testUserController() throws Exception {
        //测试EntityController
        RequestBuilder request = null;

        // 1、get查一下user列表，应该为空 
        request = get("/entities/");

        /*mockMvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("[]")));*/

        ResultActions perform = mockMvc.perform(request);
        System.out.println(perform);
        MvcResult mvcResult = perform.andReturn();
        System.out.println(mvcResult);
        /*ResultMatcher resultMatcher = new ResultMatcher() {
            @Override
            public void match(MvcResult mvcResult) throws Exception {

            }
        };
        perform.andExpect(resultMatcher);*/
        /*// 2、post提交一个user
        request = post("/users/")
                .param("id", "1")
                .param("name", "测试大师")
                .param("age", "20");
        mockMvc.perform(request)
                .andExpect(content().string(equalTo("success")));

        // 3、get获取user列表，应该有刚才插入的数据 
        request = get("/users/");
        mockMvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("[{\"id\":1,\"name\":\"测试大师\",\"age\":20}]")));

        // 4、put修改id为1的user 
        request = put("/users/1")
                .param("name", "测试终极大师")
                .param("age", "30");
        mockMvc.perform(request)
                .andExpect(content().string(equalTo("success")));

        // 5、get一个id为1的user 
        request = get("/users/1");
        mockMvc.perform(request)
                .andExpect(content().string(equalTo("{\"id\":1,\"name\":\"测试终极大师\",\"age\":30}")));

        // 6、del删除id为1的user 
        request = delete("/users/1");
        mockMvc.perform(request)
                .andExpect(content().string(equalTo("success")));

        // 7、get查一下user列表，应该为空 
        request = get("/users/");
        mockMvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("[]")));*/

    }

}

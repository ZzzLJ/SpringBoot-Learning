package com.springboot.controller;

import com.springboot.pojo.Entity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

/**
 * @Author: ZzzLJ
 */
@RestController
@RequestMapping(value="/entities")     // 通过这里配置使下面的映射都在/entities下
public class EntityController {

    // 创建线程安全的Map 
    private static Map<Long, Entity> entities = Collections.synchronizedMap(new HashMap<Long, Entity>());

    @RequestMapping(value="/", method= RequestMethod.GET)
    public List<Entity> getUserList() {
        // 处理"/entities/"的GET请求，用来获取用户列表 
        // 还可以通过@RequestParam从页面中传递参数来进行查询条件或者翻页信息的传递 
        return new ArrayList<Entity>(entities.values());
    }

    @RequestMapping(value="/", method=RequestMethod.POST)
    public String postUser(@ModelAttribute Entity entity) {
        // 处理"/entities/"的POST请求，用来创建User 
        // 除了@ModelAttribute绑定参数之外，还可以通过@RequestParam从页面中传递参数 
        entities.put(entity.getId(), entity);
        return "success";
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public Entity getUser(@PathVariable Long id) {
        // 处理"/entities/{id}"的GET请求，用来获取url中id值的User信息 
        // url中的id可通过@PathVariable绑定到函数的参数中 
        return entities.get(id);
    }

    @RequestMapping(value="/{id}", method=RequestMethod.PUT)
    public String putUser(@PathVariable Long id, @ModelAttribute Entity entity) {
        // 处理"/entities/{id}"的PUT请求，用来更新User信息 
        Entity e = entities.get(id);
        e.setName(entity.getName());
        e.setAge(entity.getAge());
        entities.put(id, e);
        return "success";
    }

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public String deleteUser(@PathVariable Long id) {
        // 处理"/entities/{id}"的DELETE请求，用来删除User 
        entities.remove(id);
        return "success";
    }

}

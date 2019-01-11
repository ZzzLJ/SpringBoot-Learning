package com.springbootswagger2.controller;

import com.springbootswagger2.pojo.User;
import com.springbootswagger2.service.UserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @Author: ZzzLJ
 *
 */
@Api(value = "UserController",description = "用户相关API")
@ApiModel(value = "ApiModel测试")
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    //@ApiOperation：增加函数API说明
    @ApiOperation(value = "获取用户列表", notes = "获取用户列表notes",
            httpMethod = "GET", produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<User> getUsers() {
        List<User> users = userService.getUser();
        return users;
    }

    @ApiOperation(value = "根据用户id查找用户")
    //@ApiImplicitParams、@ApiImplicitParam：增加参数说明
    @ApiImplicitParam(name = "id", value = "用户id", required = true, dataType = "Long")
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> findUserById(@PathVariable("id") Long id) {
        User user = userService.findUserById(id);
        if (null == user) {
            return new ResponseEntity<>(user, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @ApiOperation(value = "创建用户")
    @ApiImplicitParam(name = "user", value = "用户实体对象", required = true, dataType = "User")
    @PostMapping(value = "/create", headers = "Accept=application/json")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        userService.createUser(user);
        User reUser = userService.findUserById(user.getId());
        return new ResponseEntity<>(reUser, HttpStatus.CREATED);
    }

    @ApiOperation(value = "根据用户id更新用户")
    @ApiImplicitParam(name = "currentUser", value = "用户实体对象", required = true, dataType = "User")
    @PutMapping(value = "/update",headers = "Accept=application/json")
    public ResponseEntity<String> update(@RequestBody User currentUser){
        User user = userService.findUserById(currentUser.getId());
        if(null == user){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        user.setName(currentUser.getName());
        userService.update(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @ApiOperation(value = "根据用户id删除用户")
    @ApiImplicitParam(name = "id", value = "用户id", required = true, dataType = "Long")
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> deleteUserById(@PathVariable Long id){
        User user = userService.findUserById(id);
        if(null == user){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        userService.deleteUserById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

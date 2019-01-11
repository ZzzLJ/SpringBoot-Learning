#### springboot-Swagger2 Structure
    ├─main
    │  ├─java
    │  │  └─com
    │  │      └─springbootswagger2
    │  │          │  SpringbootSwagger2Application.java     
    │  │          │
    │  │          ├─config
    │  │          │      Swagger2Config.java        Swagger2配置类
    │  │          │
    │  │          ├─controller
    │  │          │      UserController.java       
    │  │          │
    │  │          ├─pojo
    │  │          │      User.java
    │  │          │
    │  │          └─service
    │  │              │  UserService.java
    │  │              │
    │  │              └─impl
    │  │                      UserServiceImpl.java
    │  │
    │  └─resources
    │      │  application.properties
    │      │
    │      ├─static
    │      └─templates
    └─test
        └─java
            └─com
                └─springbootswagger2
                        SpringbootSwagger2ApplicationTests.java  

Swagger 是一个规范和完整的框架，用于生成、描述、调用和可视化 RESTful 风格的 Web 服务。总体目标是使客户端和文件系统作为服务器以同样的速度来更新。文件的方法，参数和模型紧密集成到服务器端的代码，允许API来始终保持同步。Swagger 让部署管理和使用功能强大的API从未如此简单。

Swagger2 Api页面：[http://localhost:8080/swagger-ui.html#/](https://www.google.com)
####相关注解
1. @Api

    用在类上，说明该类的作用
    ```
    @Api(value = "UserController",description = "用户相关API")
    ```
2. @ApiOperation

    用在上方法上，说明方法的作用
    ```
    @ApiOperation(value = "获取用户列表", notes = "获取用户列表notes", httpMethod = "GET", produces = MediaType.APPLICATION_JSON_VALUE)
    ```
3. @ApiImplicitParams
 
     用在方法上，包含一组参数说明
     ```
     @ApiImplicitParams({
                 @ApiImplicitParam(),
                 @ApiImplicitParam()
         })
     ```
4. @ApiImplicitParam
  
      用在方法上，说明一个参数的详细信息
      paramType：参数放在哪个地方
      header->请求参数的获取：@RequestHeader
      query->请求参数的获取：@RequestParam
      path（用于restful接口）->请求参数的获取：@PathVariable
      body（不常用）
      form（不常用）
      name：参数名
      dataType：参数类型
      required：参数是否必须传
      value：参数的意思
      defaultValue：参数的默认值
      ```
      @ApiImplicitParam(name = "id", value = "用户id", required = true, dataType = "Long")
      ```
5. @ApiResponses
  
      用于表示一组响应
      ```
      @ApiResponses({
                  @ApiResponse(code = 404, message = "错误响应信息", response = java.lang.Void.class)
          })
      ```
6. @ApiResponse
        
     ```
      @ApiResponse(code = 404, message = "错误响应信息", response = java.lang.Void.class)
     ```
7. @ApiModel
   
      用于类，描述一个Model的信息（这种一般用在post创建的时候，使用@RequestBody这样的场景，请求参数无法使用@ApiImplicitParam注解进行扫描的时候）
      ```
       @ApiModel(value = "XXX实体类")
      ```
8. @ApiModelProperty
   
      用于方法，字段，表示对model属性的说明或者数据操作更改
      ```
       @ApiModelProperty()
      ```
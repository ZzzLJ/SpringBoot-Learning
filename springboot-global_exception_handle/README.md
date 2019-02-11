#### Springboot-global_exception_handle Structure

    ├─main
    │  ├─java
    │  │  └─com
    │  │      └─springbootglobal_exception_handle
    │  │          │  SpringbootGlobalExceptionHandleApplication.java
    │  │          │
    │  │          ├─bean
    │  │          │      ExceptionEnum.java     异常枚举类
    │  │          │      ResponseMap.java       返回前端信息
    │  │          │
    │  │          ├─controller
    │  │          │      CustomizeExceptionResolver.java        异常处理方式一
    │  │          │      ExceptionController.java               异常处理方式二
    │  │          │      ExceptionHandleController.java         异常处理方式三
    │  │          │
    │  │          └─exception       自定义异常
    │  │                  CustomException1.java
    │  │                  ServiceLogicException.java
    │  │
    │  └─resources
    │      │  application.properties
    │      │
    │      ├─static
    │      └─templates
    └─test
        └─java
            └─com
                └─springbootglobal_exception_handle     单元测试
                   │  SpringbootGlobalExceptionHandleApplicationTests.java
                    │
                    ├─controller
                    │      ExceptionControllerTest.java
                    │
                    ├─pojo
                    │      LombokBean.java      Lombok的使用
                    │
                    └─test
                            AllGlobalErrorController.java       
                            LombokTest.java                     
                            PartGlobalErrorController.java      

###### SpringBoot异常处理方式
1、  @ControllerAdvice + @ExceptionHandler：配置对全局异常进行处理

    // 监控所有的被@RestController注解的Controllers类 
    @ControllerAdvice(annotations = RestController.class)
    public class AnnotationAdvice {}
    
    // 监控特定的包下的Controllers类
    @ControllerAdvice("org.example.controllers")
    public class BasePackageAdvice {}
    
    // 监控指定类的Controllers类
    @ControllerAdvice(assignableTypes = {ControllerInterface.class, AbstractController.class})
    public class AssignableTypesAdvice {}
    
2、  @Controller + @ExceptionHandler：配置对当前所在Controller的异常进行处理

3、  @Component + 实现HandlerExceptionResolver,Ordered接口：自定义全局异常处理
    
    Ordered接口 设置自定义异常处理优先级
    * HIGHEST_PRECEDENCE：该优先级覆盖异常处理方式1、2
    * LOWEST_PRECEDENCE：
    
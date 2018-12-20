#### springboot-start Structure
    ├─main
    │  ├─java
    │  │  └─com
    │  │      └─springboot
    │  │          │  SpringbootApplication.java
    │  │          │
    │  │          ├─controller      Springboot实现Restful服务，基于HTTP/JSON传输
    │  │          │      EntityController.java
    │  │          │      IndexController.java
    │  │          │      UserController.java
    │  │          │
    │  │          ├─dao
    │  │          │      UserDao.java
    │  │          │
    │  │          ├─interceptor
    │  │          │      AccessTokenVerifyInterceptor.java
    │  │          │
    │  │          ├─pojo
    │  │          │      Entity.java
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
    └─test
        └─java
            └─com
                └─springboot
                    └─controller        Springboot单元测试
                            EntityControllerTest1.java
                            EntityControllerTest2.java
    

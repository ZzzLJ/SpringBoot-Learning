#### Springboot-mybatis_plus Structure
    ├─main
    │  ├─java
    │  │  └─com
    │  │      ├─mybatis_plus
    │  │      │  └─generator        MyBatis-Plus代码生成
    │  │      │      ├─common
    │  │      │      │      BaseController.java
    │  │      │      │      BaseEntity.java
    │  │      │      │
    │  │      │      ├─controller
    │  │      │      │      UsersController.java
    │  │      │      │
    │  │      │      ├─entity
    │  │      │      │      Users.java
    │  │      │      │
    │  │      │      ├─mapper
    │  │      │      │      UsersMapper.java
    │  │      │      │
    │  │      │      └─service
    │  │      │          │  IUsersService.java
    │  │      │          │
    │  │      │          └─impl
    │  │      │                  UsersServiceImpl.java
    │  │      │
    │  │      └─springbootmybatis_plus
    │  │          │  SpringbootMybatisPlusApplication.java
    │  │          │
    │  │          ├─config      分页插件配置
    │  │          │      MybatisPlusConfig.java
    │  │          │
    │  │          ├─mapper
    │  │          │      UserMapper.java
    │  │          │      UserMapper.xml
    │  │          │
    │  │          └─model
    │  │                  User.java
    │  │
    │  └─resources
    │      │  application.yml
    │      │
    │      ├─mapper
    │      │  └─generator
    │      │          UsersMapper.xml
    │
    └─test
        └─java
            └─com
                └─springbootmybatis_plus
                        CodeGenerator.java      AutoGenerator:MyBatis-Plus代码生成器
                        SpringbootMybatisPlusApplicationTests.java      MyBatis-Plus测试类
#### Springboot-mybatis Structure
    ├─main
    │  ├─java
    │  │  └─com
    │  │      └─springbootmybatis
    │  │          │  SpringbootMybatisApplication.java      在应用启动类添加注解@MapperScan，注册Mybatis mapper接口类
    │  │          │
    │  │          ├─controller
    │  │          │      CityController.java
    │  │          │      CityRestController.java
    │  │          │      UserController.java
    │  │          │
    │  │          ├─dao
    │  │          │      AnnotationDao.java     基于注解的Mapper接口
    │  │          │      CityDao.java
    │  │          │      CityDao.xml            SQL XML文件和独立的Mapper接口
    │  │          │      UserDao.java
    │  │          │
    │  │          ├─handler
    │  │          │      BaseEnumTypeHandler.java       Mybatis EnumTypeHandler自定义统一处理器
    │  │          │      User.java
    │  │          │    
    │  │          ├─model
    │  │          │      City.java
    │  │          │      User.java
    │  │          │
    │  │          └─service
    │  │              │  CityService.java
    │  │              │  UserService.java
    │  │              │
    │  │              └─impl
    │  │                      CityServiceImpl.java
    │  │                      UserServiceImpl.java
    │  │
    │  └─resources
    │      │  application.properties        mybatis配置
    │      │
    │      ├─mybatis-generator
    │      │      generatorConfig.xml       mybatis逆向工程配置文件
    │      │
    │      └─web
    │              city.ftl
    │              cityList.ftl
    │
    └─test
        └─java
            └─com
                └─springbootmybatis         单元测试
                    ├─controller
                    │      UserControllerTest.java
                    │
                    └─dao
                            AnnotationDaoTest.java
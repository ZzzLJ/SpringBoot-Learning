#### Springboot-multi-datasource Structure
    └─main
        ├─java
        │  └─org
        │      └─spring
        │          └─springboot
        │              │  Application.java
        │              │
        │              ├─config     多数据源的配置
        │              │      ClusterDataSourceConfig.java
        │              │      MasterDataSourceConfig.java
        │              │
        │              ├─controller
        │              │      UserRestController.java
        │              │
        │              ├─dao
        │              │  ├─cluster
        │              │  │      CityDao.java
        │              │  │
        │              │  └─master
        │              │          UserDao.java
        │              │
        │              ├─domain
        │              │      City.java
        │              │      User.java
        │              │
        │              └─service
        │                  │  UserService.java
        │                  │
        │                  └─impl
        │                          UserServiceImpl.java
        │
        └─resources
            │  application.properties
            │
            └─mapper
                ├─cluster
                │      CityMapper.xml
                │
                └─master
                        UserMapper.xml


当业务数据量达到了一定程度，DBA 需要合理配置数据库资源。即配置主库的机器高配置，把核心高频的数据放在主库上；把次要的数据放在从库，低配置。开源节流嘛，就这个意思。把数据放在不同的数据库里，就需要通过不同的数据源进行操作数据。
    
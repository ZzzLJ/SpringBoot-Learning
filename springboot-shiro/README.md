#### Springboot-shiro Structure
    ├─main
    │  ├─java
    │  │  └─com
    │  │      └─springbootshiro
    │  │          │  SpringbootShiroApplication.java
    │  │          │
    │  │          ├─config
    │  │          │      CustomShiroRealm.java
    │  │          │
    │  │          ├─dao
    │  │          │      PermissionMapper.java
    │  │          │      PermissionSqlProvider.java
    │  │          │      RoleMapper.java
    │  │          │      RoleSqlProvider.java
    │  │          │      UserMapper.java
    │  │          │      UserSqlProvider.java
    │  │          │
    │  │          ├─domain
    │  │          │      Permission.java
    │  │          │      PermissionExample.java
    │  │          │      Role.java
    │  │          │      RoleExample.java
    │  │          │      User.java
    │  │          │
    │  │          ├─interceptor
    │  │          │      CustomInterceptor.java
    │  │          │
    │  │          └─service
    │  │              │  ILoginService.java
    │  │              │
    │  │              └─impl
    │  │                      LoginServiceImpl.java
    │  │
    │  └─resources
    │      │  application.yml
    │      │
    │      └─mybatis-generator
    │              generatorConfig.xml
    │
    └─test
        ├─java
        │  │  ShiroTest.java        Shiro测试类
        │  │
        │  ├─com
        │  │  └─springbootshiro
        │  │          SpringbootShiroApplicationTests.java
        │  │
        │  └─realm
        │          CryptographyRealm.java
        │          CustomShiroRealm.java        自定义realm
        │
        └─resources     Shiro配置文件
               shiro-cryptography.ini
                shiro-custom.ini
                shiro-ini.ini
                shiro-realm.ini
#### springboot-thymeleaf_freemarker Structure
        ├─main
        │  ├─java
        │  │  └─com
        │  │      └─springboot
        │  │          └─thymeleaf_freemarker
        │  │              │  ThymeleafFreemarkerApplication.java
        │  │              │
        │  │              ├─domain
        │  │              │      Book.java
        │  │              │
        │  │              ├─service
        │  │              │  │  BookService.java
        │  │              │  │
        │  │              │  └─impl
        │  │              │          BookServiceImpl.java
        │  │              │
        │  │              └─web
        │  │                      FreemarkerController.java
        │  │                      HtmlController.java
        │  │                      ThymeleafController.java
        │  │
        │  └─resources
        │      │  application.properties        Freemarker、Thymeleaf 配置
        │      │
        │      ├─freemarker
        │      │      freemarker.ftl
        │      │
        │      ├─static
        │      │  ├─css
        │      │  │      default.css
        │      │  │
        │      │  └─images
        │      │          favicon.ico
        │      │
        │      └─templates
        │          ├─html
        │          │      static.html
        │          │
        │          └─thymeleaf
        │                  bookform.html
        │                  bookList.html
        │                  freemarker.html
        │
        └─test
            └─java
                └─com
                    └─springboot
                        └─thymeleaf_freemarker
                                ThymeleafFreemarkerApplicationTests.java
    
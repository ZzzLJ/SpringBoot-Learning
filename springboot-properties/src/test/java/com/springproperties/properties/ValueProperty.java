package com.springproperties.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
//@Value 注解自动绑定属性值
//@ConfigurationProperties(prefix = "user")
public class ValueProperty {
    @Value("${user.id}")
    private Long id;
    @Value("${user.age}")
    private int age;
    @Value("${user.desc}")
    private String desc;
    @Value("${user.uuid}")
    private String uuid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "UserProperty{" +
                "id=" + id +
                ", age=" + age +
                ", desc='" + desc + '\'' +
                ", uuid='" + uuid + '\'' +
                '}';
    }
}

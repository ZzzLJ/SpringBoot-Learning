package com.springproperties.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//@Component 作为 Bean 注入到 Spring 容器中
@Component
//@ConfigurationProperties(prefix = "myself”) 注解，将配置文件中以 myself 前缀的属性值自动绑定到对应的字段中
@ConfigurationProperties(prefix = "myself")
public class MySelfProperty {
    private String name;
    private String address;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "MySelf{" +
                "name='" + name + '\'' +
                ", Number=" + address +
                ", description='" + description + '\'' +
                '}';
    }
}

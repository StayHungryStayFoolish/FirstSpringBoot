package com.example.demo.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by bonismo@hotmail.com
 * 上午2:21 on 17/12/2.
 *
 * @ConfigurationProperties 注解如果报编译，不影响正常运行。
 * 在不指定路径的情况下，默认在 resources 下边的 application.properties(yml)
 * 文件中查找，如果找到则返回值，如果没有返回默认值 null/0/false 等
 * 关闭提示在 springBoot 取消勾选 show notification panel
 *
 * 可以通过以上注解，将属性注入进 Bean 中，也可以使用
 * @Value("${name}") 来注解
 */
@Component
@ConfigurationProperties(prefix = "girl")
public class GirlProperties {

    private String name;
    private int age;

    public GirlProperties() {
    }

    public GirlProperties(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "GirlProperties ->" +
                "name='" + name + '\'' +
                ", age=" + age ;
    }
}

package cn.jk.study.spring.annotation.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

/**
 * 使用 @Value 赋值
 *   1. 基本数值
 *   2. SpEL: #{}
 *   3. 运行环境变量中的值: ${}
 *     使用 @PropertySource 读取外部文件后使用
 *
 * @PropertySource
 *   引入多个文件时，相同 key 获取最后一个 value
 *   可通过 ApplicationContext.getEnvironment.getProperty(key) 获取
 *
 * Created by jiakang on 2018/9/3.
 */
@PropertySource({
        "classpath:/personb.properties",
        "classpath:/person.properties"
})
public class Person {
    @Value("zhangsan")
    private String name;
    @Value("#{20-2}")
    private int age;
    @Value("${person.nickname}")
    private String nickName;

    public Person() {
        super();
    }

    public Person(String name, int age) {
        System.out.println("create person - "+name);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", nickName='").append(nickName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

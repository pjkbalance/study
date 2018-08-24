package cn.jk.study.annotation.demo03.bean;

import cn.jk.study.annotation.demo03.annotation.JkColumn;
import cn.jk.study.annotation.demo03.annotation.JkTable;

/**
 * Created by jiakang on 2018/8/20.
 */
@JkTable("T_STUDENT")
public class Student {
    @JkColumn(name = "id", type = "int", length = 10)
    private int id;
    @JkColumn(name = "name", type = "varchar", length = 10)
    private String name;
    @JkColumn(name = "age", type = "int", length = 3)
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}

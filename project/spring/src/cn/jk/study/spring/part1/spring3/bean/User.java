package cn.jk.study.spring.part1.spring3.bean;

/**
 * Created by jiakang on 2018/8/16.
 */
public class User {
    private String name;
    private int age;
    private String sex;
    private String desc;

    public void setName(String name) {
        this.name = name;
    }

    public User() {
        System.out.println("--> User()");
        this.name = "user-1";
    }

    public User(String name) {
        System.out.println("--> User(String name) - name - "+name);
        this.name = name;
    }

    public User(String name, String sex) {
        System.out.println("--> User(String name, String sex) - name - "+name+" - sex - "+sex);
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "name: ["+name+"]; age: ["+age+"]; sex: ["+sex+"]; desc: ["+desc+"].";
    }
}

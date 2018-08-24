package cn.jk.study.spring.part1.spring1;

/**
 * Created by jiakang on 2018/8/16.
 */
public class Hello {
    String name;

    //spring 依赖注入时调用
    public void setName(String name) {
        this.name = name;
    }

    public void hello() {
        System.out.println("hello "+name);
    }
}

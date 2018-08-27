package cn.jk.study.spring.part1.cglib;

/**
 * Created by jiakang on 2018/8/27.
 */
public class Cat extends Animal {

    @Override
    String eat() {
        System.out.println("cat eat...");
        return "Cat.eat()";
    }
}

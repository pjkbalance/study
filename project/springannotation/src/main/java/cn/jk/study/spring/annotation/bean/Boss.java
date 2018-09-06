package cn.jk.study.spring.annotation.bean;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by jiakang on 2018/9/6.
 */
public class Boss {
    //1. @Autowired
    private Car car;

    //2. @Autowired
    public void setCar(Car car) {
        this.car = car;
    }

    public Boss(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Boss{");
        sb.append("car='").append(car).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

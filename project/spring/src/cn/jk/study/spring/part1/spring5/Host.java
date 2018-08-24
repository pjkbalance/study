package cn.jk.study.spring.part1.spring5;

/**
 * Created by jiakang.peng on 2018/8/19.
 */
public class Host implements Rent {
    @Override
    public void rent() {
        System.out.println("Host - rent the house");
    }
}

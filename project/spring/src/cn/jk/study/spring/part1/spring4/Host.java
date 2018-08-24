package cn.jk.study.spring.part1.spring4;

/**
 * Created by jiakang on 2018/8/16.
 */
public class Host implements Rent {
    @Override
    public void rent() {
        System.out.println("host - rent the house");
    }
}

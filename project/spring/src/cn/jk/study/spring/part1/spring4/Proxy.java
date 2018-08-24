package cn.jk.study.spring.part1.spring4;

/**
 * Created by jiakang on 2018/8/16.
 */
public class Proxy implements Rent {
    Host host = new Host();

    private void  seeHouse() {
        System.out.println("proxy - see the house");
    }

    private void getPay() {
        System.out.println("proxy - get the pay");
    }

    @Override
    public void rent() {
        seeHouse();
        host.rent();
        getPay();
    }
}

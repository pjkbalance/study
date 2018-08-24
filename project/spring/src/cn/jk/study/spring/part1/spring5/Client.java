package cn.jk.study.spring.part1.spring5;

/**
 * Created by jiakang.peng on 2018/8/19.
 */
public class Client {
    public static void main(String... args) {
        Host host = new Host();
        ProxyInvationHandler h = new ProxyInvationHandler();
        h.setTarget(host);
        Rent rent = (Rent)h.getProxy();
        System.out.println("before Client.rent()");
        rent.rent();
        System.out.println("after Clinet.rent()");
    }
}

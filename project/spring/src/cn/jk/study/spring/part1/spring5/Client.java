package cn.jk.study.spring.part1.spring5;

import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by jiakang.peng on 2018/8/19.
 */
public class Client {
    public static void main(String... args) throws IOException {
        Host host = new Host();
        ProxyInvationHandler h = new ProxyInvationHandler();
        h.setTarget(host);
        Rent rent = (Rent)h.getProxy();
        System.out.println("before Client.rent()");
        rent.rent();
        System.out.println("after Clinet.rent()");

        /*
        byte[] data = ProxyGenerator.generateProxyClass("$Proxy0.class", new Class[] {Rent.class});
        FileOutputStream out = new FileOutputStream("E:\\project\\jk\\study\\project\\spring\\src\\cn\\jk\\study\\spring\\part1\\spring5\\$Proxy0.class");
        out.write(data);
        out.close();
        */
    }
}

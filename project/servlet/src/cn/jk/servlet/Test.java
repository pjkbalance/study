package cn.jk.servlet;

/**
 * Created by jiakang on 2018/11/12.
 */
public class Test {

    private static String test() {
        try {
            String a=null;
            a.equals("a");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("e");
        }
        return "test";
    }
    public static void main(String... args) {
        System.out.println(test());
    }
}

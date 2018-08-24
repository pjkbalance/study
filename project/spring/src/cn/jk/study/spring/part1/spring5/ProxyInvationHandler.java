package cn.jk.study.spring.part1.spring5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by jiakang.peng on 2018/8/19.
 */
public class ProxyInvationHandler implements InvocationHandler {
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    /**
     * 返回代理实例
     */
    public Object getProxy() {
        return Proxy.newProxyInstance(
                this.getClass().getClassLoader(),//类加载器
                target.getClass().getInterfaces(),//所需代理的接口
                this//处理接口方法的调用类（invoke方法所在类）
        );
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("ProxyInvationHandler.invoke() begin");
        seeHouse();
        System.out.println("before method invoke()");
        Object result = method.invoke(target, args);
        System.out.println("after method invoke()");
        getPay();
        return result;
    }

    private void  seeHouse() {
        System.out.println("proxy - see the house");
    }

    private void getPay() {
        System.out.println("proxy - get the pay");
    }

}

package cn.jk.study.spring.part2.demo1;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * 观察者模式实现 - 监听类
 * Created by jiakang on 2018/8/22.
 */
public class EmailNotifier implements ApplicationListener{
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if(event instanceof EmailEvent) {
            EmailEvent emailEvent = (EmailEvent) event;
            System.out.println("address: "+emailEvent.getAddress()+"; text: "+emailEvent.getText());
        } else {
            System.out.println("other event: "+event);
        }
    }
}

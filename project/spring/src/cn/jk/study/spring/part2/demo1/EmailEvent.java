package cn.jk.study.spring.part2.demo1;

import org.springframework.context.ApplicationEvent;

/**
 * 观察者模式实现 - 事件类
 * Created by jiakang on 2018/8/22.
 */
public class EmailEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public EmailEvent(Object source, String address, String text) {
        super(source);
        this.address = address;
        this.text = text;
    }

    private String address;
    private String text;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

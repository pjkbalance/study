package cn.jk.study.spring.annotation.factoy;

import cn.jk.study.spring.annotation.bean.Black;
import cn.jk.study.spring.annotation.bean.Color;
import org.springframework.beans.factory.FactoryBean;

/**
 * Created by jiakang on 2018/9/4.
 */
public class ColorFactoryBean implements FactoryBean<Black> {
    @Override
    public Black getObject() throws Exception {
        return new Black();
    }

    @Override
    public Class<Black> getObjectType() {
        return Black.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}

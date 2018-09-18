package cn.jk.study.spring.annotation.config;

import cn.jk.study.spring.annotation.bean.Rainbow;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jiakang on 2018/9/12.
 */
@Configuration
public class TestConfig {
    @Bean
    public Rainbow rainbow() {
        return new Rainbow();
    }
}

package cn.jk.study.spring.annotation.config;

import cn.jk.study.spring.annotation.bean.Person;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @see cn.jk.study.spring.annotation.bean.Person
 * Created by jiakang on 2018/9/5.
 */
@Configuration
@Import(Person.class)
public class PropertyValueConfig {
}

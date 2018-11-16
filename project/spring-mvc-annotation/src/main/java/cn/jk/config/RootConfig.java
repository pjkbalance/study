package cn.jk.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * Created by jiakang on 2018/11/16.
 */
@ComponentScan(
        value="cn.jk",
        excludeFilters = {
                @ComponentScan.Filter(
                        type = FilterType.ANNOTATION,
                        classes = {
                                Controller.class
                        }
                )
        }
)
public class RootConfig {
}

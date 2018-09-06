package cn.jk.study.spring.annotation.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * @Profile 根据当前环境，动态激活或切换组件的功能
 *   1 需要激活的 类 或 方法 上添加 @Profile(标识名称) - 表示名称默认为 default
 *   2.1 在虚拟机参数位置使用命令行参数 -Dspring.profiles.active=标识名称
 *   2.2.1 使用无参构造器创建 applicationContext
 *   2.2.2 设置激活环境 applicationContext.getEnvironment().setActiveProfiles(String... activeProfiles)
 *   2.2.3 调用配置类 applicationContext.register(Config.class)
 *   2.2.4 启动刷新容器 applicationContext.refresh()
 *
 * Created by jiakang on 2018/9/6.
 */
@Configuration
public class ProfileConfig {

    @Profile("guns")
    @Bean
    public DataSource gunsDataSource() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/guns");
        dataSource.setUser("root");
        dataSource.setPassword("Pjk911020");
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        return dataSource;
    }

    @Profile("chac")
    @Bean
    public DataSource chacDataSource() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/chac");
        dataSource.setUser("root");
        dataSource.setPassword("Pjk911020");
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        return dataSource;
    }
}

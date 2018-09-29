package cn.jk.study.spring.tx.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @see cn.jk.study.spring.tx.service.UserService
 * 配置数据源，JdbcTemplate (Spring提供的简化数据库操作的工具)
 * @EnableTransactionManagement 开启事务管理功能
 * @Transactional 表示当前为一个事务方法
 * 配置事务管理器控制事务
 *
 * @EnableTransactionManagement
 *   import TransactionManagementConfigurationSelector
 *     导入组件 AutoProxyRegistrar, ProxyTransactionManagementConfiguration
 * AutoProxyRegistrar 注册 InfrastructureAdvisorAutoProxyCreator
 *   利用后置处理器机制，在对象创建之后包装对象成为代理对象；代理对象使用拦截器链执行调用
 *
 * ProxyTransactionManagementConfiguration
 *   配置文件，给容器中注册事务增强器
 *     事务增强器调用事务注解信息
 *     事务拦截器
 *
 *
 * Created by jiakang on 2018/9/13.
 */

@Configuration
@PropertySource("classpath:/db.properties")
@ComponentScan(basePackages = "cn.jk.study.spring.tx")
@EnableTransactionManagement
public class TxConfig {
    @Value("${db.jdbcUrl}")
    private String jdbcUrl;
    @Value("${db.user}")
    private String user;
    @Value("${db.password}")
    private String password;
    @Value("${db.driverClass}")
    private String driverClass;

    @Bean
    public DataSource gunsDataSource() throws Exception {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(user);
        dataSource.setPassword(password);
        dataSource.setDriverClass(driverClass);
        dataSource.setJdbcUrl(jdbcUrl);
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() throws Exception {
        return new JdbcTemplate(gunsDataSource());
    }

    @Bean
    public PlatformTransactionManager dataSourceTransactionManager() throws Exception {
        return new DataSourceTransactionManager(gunsDataSource());
    }
}

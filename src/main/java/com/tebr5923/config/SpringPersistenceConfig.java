package com.tebr5923.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.tebr5923")
@PropertySource("classpath:db.properties")
@EnableTransactionManagement
public class SpringPersistenceConfig {
    @Value("${db.driver}")
    private String driver;

    @Value("${db.url}")
    private String url;

    @Value("${db.user}")
    private String user;

    @Value("${db.password}")
    private String password;

    @Value("${db.initial_size}")
    private int initialSize;

    @Value("${db.max_total}")
    private int maxTotal;

    @Bean
    public DataSource dataSource(){
        final BasicDataSource dataSource = new BasicDataSource();

        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);
        dataSource.setInitialSize(initialSize);
        dataSource.setMaxTotal(maxTotal);

        return dataSource;

    }
}

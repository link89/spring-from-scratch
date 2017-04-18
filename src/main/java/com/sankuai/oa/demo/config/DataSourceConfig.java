package com.sankuai.oa.demo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Value("${spring.datasource.druid.username}")
    private String username;

    @Bean
    @Primary
    @ConfigurationProperties(prefix="spring.datasource.druid")
    public DataSource dataSource() {
        return DataSourceBuilder
                .create()
                .type(DruidDataSource.class)
                .build();
    }
}

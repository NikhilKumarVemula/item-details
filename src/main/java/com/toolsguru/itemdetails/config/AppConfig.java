//package com.toolsguru.itemdetails.config;
//
//import javax.sql.DataSource;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//
//
//@Configuration
//@ComponentScan("com.toolsguru.itemdetails")
//@PropertySource("classpath:application.properties")
//public class AppConfig {
//
//    @Bean
//    DataSource dataSource() {
//        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
//
//        driverManagerDataSource.setDriverClassName("org.h2.Driver");
//        driverManagerDataSource.setUrl("dbc:h2:~/test");
//        driverManagerDataSource.setUsername("sa");
//        driverManagerDataSource.setPassword("");
//        return driverManagerDataSource;
//    }
//
//}

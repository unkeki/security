package com.ooamo.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

//    @Bean
//    public UserDetailsService userDetailsService() {
//        // 创建基于内存的用户资源管理器
//        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
//        // 使用manager管理UserDetail对象
//        manager.createUser(
//                // 创建UserDetail对象，用户管理用户信息
//                // 此配置会覆盖掉配置文件中所设置的用户信息
//                User.withDefaultPasswordEncoder().username("admin").password("admin").roles("USER").build()
//        );
//        return manager;
//    }

    @Bean
    public UserDetailsService userDetailsService() {
        // 创建基于数据库的用户资源管理器
        DBUserDetailsManager manager = new DBUserDetailsManager();
        return manager;
    }

}

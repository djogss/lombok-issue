package com.example.demo.springsecurity;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;

@Configuration
@EnableWebSecurity//(debug = true)
@Slf4j
public class WebSecurityConfig {


    private void addAuthorisation(ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry config) {
        log.info("test log");
        config
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')").antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')").antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')")
                .antMatchers(HttpMethod.GET, "/api/test/{justID}")
                .access("hasAuthority('DEMO_READ')");
    }
}

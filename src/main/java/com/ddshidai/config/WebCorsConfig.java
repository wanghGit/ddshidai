package com.ddshidai.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
public class WebCorsConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
//                .allowedOrigins("http://120.27.22.199", "http://www.ddshidai.com:8080", "http://www.ddshidai.com","rm-m5edw6v54903808jl.mysql.rds.aliyuncs.com","rm-m5edw6v54903808jlo.mysql.rds.aliyuncs.com");
                .allowedOrigins("http://localhost","http://localhost:8100","http://192.168.1.106","http://localhost:4200","http://localhost:3000","http://192.168.1.101:4200", "http://192.168.1.106:4200","http://192.168.1.107:4200", "http://192.168.1.100:4200");
    }
}

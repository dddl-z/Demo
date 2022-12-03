package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"org.example.controller", "org.example.config"})
@EnableWebMvc // 开启WebMvc的多种功能
public class SpringMvcConfig {
}
package com.example.springmvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//使用設定檔並掃描controller
@Configuration
@ComponentScan("com.example.springmvc.*")
public class SpringMVCConfig  implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 排除 /resources/ 下的靜態資源不經過 DispatcherServlet 處理
        registry.addResourceHandler("/webapp/**")
                .addResourceLocations("/webapp/");
    }
}

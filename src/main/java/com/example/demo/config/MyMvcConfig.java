package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/").setViewName("index");
        registry.addViewController("index.html").setViewName("index");
        registry.addViewController("chart.html").setViewName("chart");
        registry.addViewController("empty.html").setViewName("empty");
        registry.addViewController("form.html").setViewName("form");
        registry.addViewController("morris-chart.html").setViewName("morris-chart");
        registry.addViewController("tab-panel.html").setViewName("tab-panel");
        registry.addViewController("table.html").setViewName("table");
        registry.addViewController("ui-elements.html").setViewName("ui-elements");
    }

}

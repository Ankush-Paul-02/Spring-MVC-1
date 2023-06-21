package com.paul;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * We don't have to use ankush-servlet.xml, instead of we can use this config file
 */
@Configuration
@ComponentScan({"com.paul"})
public class AnkushConfig {

    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver vr = new InternalResourceViewResolver();
        vr.setPrefix("/WEB-INF/");
        vr.setSuffix(".jsp");
        return vr;
    }
}

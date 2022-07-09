package com.robertramirez.springapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

import com.robertramirez.springapp.bean.BeanInterface;
import com.robertramirez.springapp.bean.BeanInterfaceImpl;
import com.robertramirez.springapp.bean.SampleBean;

@Configuration
public class AppConfig {
    @Bean(initMethod = "init", destroyMethod = "destroy", name = { "sampleBean", "sb" })
    @Description("Demonstrate a simple bean")
    public SampleBean sampleBean() {
        return new SampleBean();
    }

    @Bean
    public BeanInterface beanInterface(){
        return new BeanInterfaceImpl();
    }
}
package com.robertramirez.springapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

import com.robertramirez.springapp.bean.BeanInterface;
import com.robertramirez.springapp.bean.BeanInterfaceImpl;
import com.robertramirez.springapp.bean.SampleBean;

@Configuration
@ComponentScans({
    @ComponentScan(basePackages = "com.robertramirez.springapp"),
    @ComponentScan(basePackageClasses = AppConfig.class)
})
@PropertySource("classpath:application.properties")
@EnableAspectJAutoProxy
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
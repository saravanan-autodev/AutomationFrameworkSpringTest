package com.logitech.config;

import com.logitech.helper.BrowserHelper;
import com.logitech.helper.DriverHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanFactory {

//    @Bean
    public DriverHelper driverHelper(){
        System.out.println("Inside driver helper bean");
        return new DriverHelper();
    }

//    @Bean
    public BrowserHelper browserHelper(){
        System.out.println("Inside browser helper bean");
        return new BrowserHelper();
    }

}

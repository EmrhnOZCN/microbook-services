package com.kitaplik.libraryservice.config;


import com.kitaplik.libraryservice.client.RetreiveMessageErrorDecoder;
import feign.Logger;
import feign.codec.ErrorDecoder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
/*
    @Bean
    public ErrorDecoder errorDecoder(){
        return new RetreiveMessageErrorDecoder();
    }

    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }*/

    @Value("${library.service.count}")
    private Integer count;

    @Bean
    public Integer count() {
        return count;
    }
}

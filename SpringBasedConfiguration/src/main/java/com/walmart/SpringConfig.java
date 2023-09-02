package com.walmart;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SpringConfig {

    @Bean
    public HelloWorld helloWorld()
    {
        HelloWorld hello=new HelloWorld();
        hello.setMessage("Welcome Boss Its look interesting");

        return hello;
    }



 

}
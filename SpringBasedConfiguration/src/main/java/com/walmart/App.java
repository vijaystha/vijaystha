package com.walmart;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App {
    public static void main( String[] args ){
    	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);

        HelloWorld hello = ctx.getBean(HelloWorld.class);

        System.out.println(hello.getMessage());
    }
}

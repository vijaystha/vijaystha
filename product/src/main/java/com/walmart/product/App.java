package com.walmart.product;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BeanFactory factory= new XmlBeanFactory(new ClassPathResource("spring.xml"));
    Object object= factory.getBean("prod");
    Products prod= (Products)object;
    
    prod.productDetails();
    }
}

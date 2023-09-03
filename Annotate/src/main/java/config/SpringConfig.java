package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import springAnnotation.Annotate.Address;
import springAnnotation.Annotate.Student;

@Configuration
public class SpringConfig {

    @Bean(name = "stu")
    public Address getAddr()
    {
        Address ad=new Address();
        ad.setFlatNo(302);
        ad.setCity("NewJersey");

        return ad;
    }

    @Bean(name = "stu123")
    @Primary
    public Address getAddr1()
    {
        Address ad=new Address();
        ad.setFlatNo(303);
        ad.setCity("Texas");

        return ad;
    }


    @Bean 
    public Student getStu()
    {

        Student stu=new Student();
//        stu.setAddress(getAddr());

        return stu;
    }

}

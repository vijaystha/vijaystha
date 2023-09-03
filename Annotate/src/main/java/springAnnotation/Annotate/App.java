package springAnnotation.Annotate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.SpringConfig;
import springAnnotation.Annotate.Student;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);

    	 

        Student s = ctx.getBean(Student.class);

        s.displayDetails();
    }
}

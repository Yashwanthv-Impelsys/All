package org.impelsys.springDemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Employee;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println( "Hello World!" );
        
        Employee bean = (Employee) context.getBean("empBean");
    
        System.out.println("Emp name:" + bean.getName()+" has been allocated: "+ bean.getDevice().getModelNum());
        bean.setName("Mr Yashwanth");
        Employee bean1 = (Employee) context.getBean("empBean     bean.setName(\"Mr Yashwanth\");\n" + 
        		"        Employee bean1 = (Employee) context.g
        		"      ");
        System.out.println("Emp name:"+ bean.getName());
    }
    
}

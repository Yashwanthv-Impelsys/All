package org.impelsys.SpringAnnotationsDemo;

import org.impelsys.model.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car myCar = (Car) applicationContext.getBean("mustang");
        System.out.println("Car :"+ myCar.getModel()+"which is of type: "+myCar.getType()+"has engine of type: "+ myCar.getEngine().getEngineType());
//        Car myCar1 = (Car) applicationContext.getBean("audi");
//        System.out.println("Car :"+ myCar1.getModel()+"which is of type: "+myCar1.getType()+"has engine of type: "+ myCar1.getEngine().getEngineType());
    }
}

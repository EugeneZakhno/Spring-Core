package io.github.euegenezakhno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args ) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CoffeeBean coffeeBean = context.getBean("testBean", CoffeeBean.class); // here are i'll pass id of class CoffeeBean
        System.out.println(coffeeBean.getName());
      }
}

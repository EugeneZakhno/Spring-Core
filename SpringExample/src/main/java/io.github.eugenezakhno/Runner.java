package io.github.eugenezakhno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        System.out.println(context.getBean("simpleBean", SimpleBean.class).getName());
    }
}

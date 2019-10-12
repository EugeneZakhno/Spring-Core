package io.github.eugenzakhno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Customers {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Employee obj = (Employee) context.getBean("employee");
        obj.displayName();
    }
}

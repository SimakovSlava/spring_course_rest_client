package org.example;

import org.example.configuration.MyConfig;
import org.example.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication =
                context.getBean("communication", Communication.class);
        List<Employee> allEmployees = communication.getAllEmployees();
        allEmployees.forEach(System.out::println);
    }
}

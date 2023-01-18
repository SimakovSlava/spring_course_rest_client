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
        /**
         * Получение и вывод в консоль всех работников.
         */
//        AnnotationConfigApplicationContext context =
//                new AnnotationConfigApplicationContext(MyConfig.class);
//        Communication communication =
//                context.getBean("communication", Communication.class);
//        List<Employee> allEmployees = communication.getAllEmployees();
//        allEmployees.forEach(System.out::println);

        /**
         * Получение и вывод в консоль конкретного работника.
         */
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication =
                context.getBean("communication", Communication.class);
        Employee employeeById = communication.getEmployee(1);
        System.out.println(employeeById);
    }
}

package com.sergeev.spring.rest;

import com.sergeev.spring.rest.configuration.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);

//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

//        Employee empByID = communication.getEmployee(1);
//        System.out.println(empByID);

//        Employee emp = new Employee("Ivan", "Zobin", "IT", 1000);
//        communication.saveEmployee(emp);

//        Employee emp = new Employee("Ivan", "Zobin", "IT", 1100);
//        emp.setId(15);
//        communication.saveEmployee(emp);

        communication.deleteEmployee(15);

    }
}

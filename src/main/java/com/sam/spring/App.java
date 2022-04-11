package com.sam.spring;

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

        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");

        Employee emp = (Employee) ctx.getBean("emp");

        //Employee emp=(Employee) ctx.getBean("emp");
        //System.out.println(emp.getId());
        //System.out.println(emp.getName());

        System.out.println( "Hello World!" );
    }
}

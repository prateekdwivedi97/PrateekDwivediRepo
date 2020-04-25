package com.capg.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.capg.beans.*;
public class TestApp1 {
  public static void main(String[] args) {
	ApplicationContext container=new ClassPathXmlApplicationContext("com/capg/cfg/Spring-Config.xml");
	Employ employ=container.getBean("cmp",Employ.class);
	System.out.println("Employ Info");
	System.out.println("----------------------------------------------------------------------------------------");
	System.out.println("Employee Id :"+" "+employ.getEmpId());
	System.out.println("Employee Name :"+" "+employ.getEmpName());
	System.out.println("Employee Salary :"+" "+employ.getSalary());
	System.out.println("Employee BU :"+" "+employ.getBusinUnit());
	System.out.println("Employee Age :"+" "+employ.getAge());
}
}

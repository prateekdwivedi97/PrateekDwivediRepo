package com.capg.test;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.capg.bean.*;
public class TestApp {
public static void main(String[] args) {
	
	ApplicationContext iocContainer=new ClassPathXmlApplicationContext("com/capg/cfg/Spring-Config.xml");
	EmployList empDetail=iocContainer.getBean("cmp",EmployList.class);
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the employee id: ");
	int empId=sc.nextInt();
	System.out.println("Employee Details");
	System.out.println("----------------------------");
	for(int i=0;i<empDetail.getEmpList().size();) {
		Employ e=empDetail.getEmpList().get(i);
		if(e.getEmpId()==empId)
		{
			System.out.println("EmpId: "+e.getEmpId()+"\nEmpName: "+e.getEmpName()+"\nEmpSalary: "+e.getSalary()+"\nEmpAge: "+e.getAge());
			break;
		}
		else
		{
			System.out.println("Id not exists");
			break;
		}
	}
	
	
	
}
}

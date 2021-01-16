package com.csi.basicconcept;

import java.util.Scanner;

public class InheritanceConcept {
	

	private static Scanner sc;

	public static void main(String[] args) {
		System.out.println("enter departmentId");
		sc = new Scanner(System.in);
		int DeptId=sc.nextInt();
		System.out.println("enter departmentName");
		String DeptName=sc.next();
		int EmpId=sc.nextInt();
		System.out.println("enter employeeId");
		System.out.println("enter employeetName");
		String EmpName=sc.next();
		System.out.println("enter employeeSalary");
		double EmpSalary=sc.nextDouble();
		
		Department d1=new Department();
		d1.get(DeptId,DeptName);
		Employee e1=new Employee();
		e1.show(EmpId,EmpName);
		e1.push(EmpId,EmpSalary);
	}
}
class Department{
	void get(int DeptId,String DeptName){
		System.out.println("departmentId:"+DeptId+"departmentName:"+DeptName);
	}
}
class Employee extends Department{
	void show(int EmpId,String EmpName){
		System.out.println("employeeId:"+EmpId+"EmployeeName:"+EmpName);
	}
	void push(int EmpId,double EmpSalary){
		System.out.println("employeeId:"+EmpId+"EmployeeSalary:"+EmpSalary);
	}
}
	
		
		
	

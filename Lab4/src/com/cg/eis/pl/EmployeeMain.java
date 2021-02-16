package com.cg.eis.pl;
import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServiceImpl;
import java.util.Scanner;
public class EmployeeMain {
	public static void main(String[] as) {
		Employee emp=new Employee();
		EmployeeServiceImpl empser=new EmployeeServiceImpl();
		int id;
		String name;
		double salary;
		String designation;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter ID of the employee");
		id=scan.nextInt();
		System.out.println("Enter Name of the Employee");
		name=scan.next();
		System.out.println("Enter Salary of the Employee");
		salary=scan.nextDouble();
		System.out.println("Enter Designation of the Employee");
		designation=scan.next();
		
		emp=empser.setEmployeeDetails(id,name,salary,designation);
		
		//empser.findInsuranceScheme(emp);
		System.out.println("---------------------------");
		System.out.println("Employee Details");
		System.out.println("---------------------------");
		empser.displayEmployeeDetails(emp);
	}
	
}

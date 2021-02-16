package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public String findInsuranceScheme(Employee emp) {
		double salary=emp.getSalary();
		String designation=emp.getDesignation();
		if(salary>=20000 && salary<30000 && designation.equals("Analyst")) 
			return "Scheme1";
		
		else if(salary>=30000 && designation.equals("Analyst")) 
			return "Scheme2";
		else if(salary>=40000 && salary<50000 && designation.equals("SeniorAnalyst")) 
			return "Scheme3";
		else if(salary>=50000 && designation.equals("SeniorAnalyst")) 
			return "Scheme4";
		else
			return "Scheme5";
		/*
		 * else { System.out.println("Employee scheme is Scheme5");
		 * emp.setInsuranceScheme("Scheme5"); }
		 */
		
	}

	@Override
	public Employee setEmployeeDetails(int id, String name, double salary, String designation) {
		Employee emp=new Employee();
		emp.setId(id);
		emp.setDesignation(designation);
		emp.setName(name);
		emp.setSalary(salary);
		emp.setInsuranceScheme(findInsuranceScheme(emp));
		return emp;
		
	}

	@Override
	public void displayEmployeeDetails(Employee emp) {
		
		System.out.println("Employee Name: "+emp.getName());
		System.out.println("Employee Id: "+emp.getId());
		System.out.println("Employee Salary: "+emp.getSalary());
		System.out.println("Employee designation: "+emp.getDesignation());
		System.out.println("Employee Insurance Scheme: "+emp.getInsuranceScheme());
	}

}

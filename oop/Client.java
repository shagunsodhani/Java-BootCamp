/**
 * 
 */
package com.solution.six;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.solution.utils.DateUtil;
import com.solution.utils.KeyboardUtil;

/**
 * @author Shagun Sodhani
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee("Gavin", "Smith", DateUtil.getDate("10-03-2011"), 45000.55));
		employees.add(new Employee("Daniel", "Smith", DateUtil.getDate("15-03-2011"), 25000.55));
		employees.add(new Employee("Michael", "Jhonson", DateUtil.getDate("30-12-2009"), 75000.95));
		employees.add(new Employee("Ava", "Jhonson", DateUtil.getDate("20-01-2013"), 9999.50));
		employees.add(new Employee("Sophia", "Loren", DateUtil.getDate("11-11-2010"), 45000.55));
		
		String sortParam;
		
		while (true){
			
			sortParam = KeyboardUtil.getString("Sort by : ");
			
			System.out.println(sortParam);
			if(sortParam.equals("firstName")){
				Collections.sort(employees, new Comparator<Employee>() {

					@Override
					public int compare(Employee o1, Employee o2) {
						int diff = o1.getFirstName().compareTo(o2.getFirstName());
						if(diff == 0)
						{
							diff = o1.getLastName().compareTo(o2.getLastName());;
						}
						return diff; 
					}
				});
			}
			else if (sortParam.equals("lastName")) {
				Collections.sort(employees, new Comparator<Employee>() {

					@Override
					public int compare(Employee o1, Employee o2) {
						int diff = o1.getLastName().compareTo(o2.getLastName());
						if(diff == 0)
						{
							diff = o1.getFirstName().compareTo(o2.getFirstName());;
						}
						return diff; 
					}
				});
			}
			else if(sortParam.equals("hireDate")){
				Collections.sort(employees, new Comparator<Employee>() {

					@Override
					public int compare(Employee o1, Employee o2) {
						int diff = o1.getHireDate().compareTo(o2.getHireDate());
						if(diff == 0)
						{
							diff = o1.getSalary().compareTo(o2.getSalary());
						}
						return diff; 
					}
				});
			}
			else if(sortParam.equals("salary")){
				Collections.sort(employees, new Comparator<Employee>() {

					@Override
					public int compare(Employee o1, Employee o2) {
						int diff = o1.getFirstName().compareTo(o2.getFirstName());
						if(diff == 0)
						{
							diff = o1.getLastName().compareTo(o2.getLastName());;
						}
						return diff; 
					}
				});
			}
			else{
				System.out.println("Input correct parameter name");
			}
			 for (Employee employee : employees) {
				 employee.printInfo();				
			}
			
		}
	}
}

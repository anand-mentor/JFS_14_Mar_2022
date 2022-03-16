package com.zensar.sort;

import java.util.Arrays;
import java.util.Comparator;

class EmployeeIdComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee emp1, Employee emp2) {
		if(emp1.id > emp2.id) {
			return -1;
		}
		else if(emp1.id < emp2.id) {
			return 1;
		}
		return 0;
	}
}
class EmployeeNameComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.name.compareTo(emp2.name);
	}
}

class Employee implements Comparable<Employee> {
	int id;
	String name;
	double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee emp) {
		if(this.salary > emp.salary) {
			return 1;
		}
		else if(this.salary < emp.salary) {
			return -1;
		}
		return 0;
	}
}

public class ComparisionTest {

	public static void main(String[] args) {
		Employee e[] = new Employee[5];
		e[0] = new Employee(1, "Tom", 10000);
		e[1] = new Employee(2, "Jerry", 13000);
		e[2] = new Employee(3, "Ivan", 8000);
		e[3] = new Employee(4, "Robert", 7500);
		e[4] = new Employee(5, "Jenifer", 18000);
		
		Arrays.sort(e, new EmployeeIdComparator());
		
		for(int i=0;i<e.length;i++) {
			System.out.println(e[i]);
		}
	}

}

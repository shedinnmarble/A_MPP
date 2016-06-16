package com.mum.daxiang.edu;

<<<<<<< HEAD
public class Employee {
	String name;
	int salary;
	public Employee(String n, int s) {
		this.name = n;
		this.salary = s;
	}
	int getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("<");
		sb.append("name: ");
		sb.append(name);
		sb.append(" salary: ");
		sb.append("" + salary+">");
		return sb.toString();
		
	}
}

=======
/**
 * Created by 985219 on 6/15/2016.
 */
public class Employee implements Comparable<Employee> {
    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;



    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
>>>>>>> 4cee95509fca0b801ecdcc2523f5aeb06188c735

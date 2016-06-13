package Q1.soln2;

import Q1.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Stream<Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000)).stream();
		
//		  System.out.println(emps
//				    .filter(e -> (e.getSalary() > 100000))
//				    .filter(e -> (e.getLastName().charAt(0) > 'M'))
//				    .map(e -> fullName(e))
//				    .sorted()
//				    .collect(Collectors.joining(", ")));
				               
		        printEmps(emps.collect(Collectors.toList()));

	}
	public static String asString(List<Employee> employeeList){
		return employeeList
				.stream()
				.filter(Main::salaryGreaterThan100000)
				.filter(Main::lastNameAfterMEmployee)
				.map(Main::fullName)
				.sorted()
				.collect(Collectors.joining(", "));
	}
	public static boolean salaryGreaterThan100000(Employee employee){
		return employee.getSalary()>100000;
	}
	public static boolean lastNameAfterMEmployee(Employee employee){
		return employee.getLastName().charAt(0)>'M';
	}
	private static void printEmps(List<Employee> employeeList){
		System.out.println(asString(employeeList));
	}
	private static String fullName(Employee e) {
		return e.getFirstName() + " " + e.getLastName();
	}

}

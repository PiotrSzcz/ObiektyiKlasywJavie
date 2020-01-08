package klasyiobiekty;

import java.time.LocalDate;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Marek Nowak", 1800, 2020, 1, 8);
		staff[1] = new Employee("Piotr Kowalski", 2000, 2010, 1, 3);
		staff[2] = new Employee("Marek Nowak", 1900, 2019, 1, 1);
		
		for(Employee e: staff)
			e.raiseSalary(7);
		
		for(Employee e: staff)
			System.out.println(e.getName()+ " " + e.getSalary()+ " " + e.getHireDay());
	}
}
	
class Employee {
		
	private String name;
	private double salary;
	private LocalDate hireDay;
		
	public Employee(String n, double s, int year, int month, int day) {
		name = n;
		salary =s;
		hireDay = LocalDate.of(year, month, day);
	}
		
	public String getName() {
		return name;
	}
		
	public double getSalary() {
		return salary;
	}
		
	public LocalDate getHireDay() {
		return hireDay;
	}
		
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
}


package entities;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		double salary = this.grossSalary - this.tax;
		return salary;
	}
	
	public void increaseSalary(double percentage) {
		percentage = percentage/100;
		this.grossSalary = (this.grossSalary - this.tax) + (this.grossSalary * percentage);
	}
	
	public String toString() {
		return name
				+ ", $ "
				+ this.grossSalary;
	}
	
}

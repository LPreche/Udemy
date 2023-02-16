package entities;

public class Funcionario {
	public String name;
	public double salary;
	public double tax;
	
	public double netSalary() {
		return salary - tax;
	}
	public void increaseSalary(double percentage) {
		this.salary = this.salary + (this.salary * (percentage/100));
	}
}

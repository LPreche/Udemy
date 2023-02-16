package Application;

import java.util.Scanner;

import entities.Funcionario;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		double percentage;
		System.out.println("Name: ");
		funcionario.name = sc.nextLine();
		System.out.println("Gross salary: ");
		funcionario.salary = sc.nextDouble();
		System.out.println("Tax: ");
		funcionario.tax = sc.nextDouble();
		
		System.out.println("Employee: "+ funcionario.name +", $"+funcionario.netSalary());
		
		System.out.println("Which percentage to increase salary? ");
		percentage = sc.nextDouble();
		funcionario.increaseSalary(percentage);
		System.out.println("Updated data: "+funcionario.name + ", $" + funcionario.netSalary());
		sc.close();
	}
}

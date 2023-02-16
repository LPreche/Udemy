package Application;

import java.util.Scanner;

import entities.Retangle;

public class Program {
	public static void main(String[] args){
		Retangle retangle = new Retangle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rectangle width and height: ");
		retangle.width = sc.nextDouble();
		retangle.height = sc.nextDouble();
		
		System.out.println("AREA = " + retangle.Area());	
		System.out.println("PERIMETER = " + retangle.Perimetro());
		System.out.println("DIAGONAL = " + retangle.Diagonal());
		sc.close();
	}
}

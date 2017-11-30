package fecJavClas;

import java.util.Scanner;

public class SmartCalculator {

	public static void main(String[] args) {

		double x, y, z, a, b, c;
		System.out.println("enter two intergers");
		Scanner in = new Scanner(System.in);
		x = in.nextDouble();
		y = in.nextDouble();
		char project = '*';
		switch (project) {

		case '+':
			z = x + y;
			System.out.println("Sum is " + z);
			break;
		case '-':
			z=x-y;
			System.out.println("Subtract "+z);
			break;
		case '*':
			z = x * y;
			System.out.println("Multi" +z);
			break;
		case '/':
			z = x / y;
			System.out.println("Divivde "+z);
			break;

		}

	}

}

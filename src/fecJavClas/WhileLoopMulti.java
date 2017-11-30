package fecJavClas;

import java.util.Scanner;

public class WhileLoopMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number,result, i = 10;
		System.out.println("Enter number");
		Scanner in = new Scanner(System.in);
		number = in.nextInt();
		while (i >= 1) {
			result = i * number;
			System.out.print(result+" ");

			i--;

		}
	}

}

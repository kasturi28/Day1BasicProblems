package basicDay1;

import java.util.Scanner;

public class SumOfCommandLineArguments {

	public static void main(String[] args) {

		int sum = 0;
		System.out.println("Enter the first number..");
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		System.out.println("Enter the second number..");
		int x2 = sc.nextInt();
		sum = x1 + x2;
		System.out.println("Addition of two numbers " + sum);

	}

}

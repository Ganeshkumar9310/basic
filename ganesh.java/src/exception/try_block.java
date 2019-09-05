package exception;

import java.util.Scanner;

public class try_block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int a = sc.nextInt();
		System.out.println("Enter b value");
		int b = sc.nextInt();

		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("you have entered invalid number");
		}

	}
}
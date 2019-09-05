package exception;

import java.util.Scanner;

public class Throw_throws {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		if(age<60)
		{
			System.out.println("Thank you");
		}
		if(age<60)
		{
			throw new ArithmeticException("Not a senior citizen");
		}
    System.out.println("Welcome");
	}

}

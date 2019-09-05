package myfirstpackage;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of a:");
		double a = sc.nextDouble();// for decimal number
		System.out.println("enter value of b:");
		int b = sc.nextInt();// for whole number
		double c = a + b;
		System.out.println("value of a+b=" + c);
		sc.close();
	}

}

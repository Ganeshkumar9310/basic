package arrays;

import java.util.Scanner;

public class InputStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of a");
		int a=sc.nextInt();
		System.out.println("enter value of b");
		int b=sc.nextInt();
		char c=sc.next().charAt(0);
		switch(c){
		case('+'):
			System.out.println(a+b);
		break;
		case('-'):
			System.out.println(a-b);
		break;
		case('*'):
			System.out.println(a*b);
		break;
		case('/'):
			System.out.println(a/b);
		break;
		
		}
		

	}

}

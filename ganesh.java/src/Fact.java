package practice;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
System.out.println("Factorial of " +n+ " is " +fact);
sc.close();
	}
}

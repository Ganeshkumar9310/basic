package practice;

import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		x=sc.nextInt();
		if(x%2!=0)
		{
			System.out.println("Odd number");
		}
		else
		{
			System.out.println("Even number");
		}
		sc.close();
	}

}

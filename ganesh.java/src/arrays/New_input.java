package arrays;

import java.util.Scanner;

public class New_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array:");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter element at " + i + " Index");
			a[i] = sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		sc.close();

	}

}

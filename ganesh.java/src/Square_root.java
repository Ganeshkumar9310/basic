package practice;

import java.util.Scanner;

public class Square_root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
        n=sc.nextInt();
        for(int i=1;i<n;i++)
        {
        	if(n/i==i)
        	{
        		System.out.println(i);
        	}
        }
        sc.close();
	}

}

package collection;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Phone_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Long> PhoneNumber = new LinkedHashSet<Long>();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Phone number:");
		long l = sc.nextLong();
		while(l!=0)
		{
			int counter=0;
			long n=l;
			while(n!=0)
			{
				n = n/10;
				counter = counter+1;
			}
			if(counter==10)
			{
			PhoneNumber.add(l);
			}
			System.out.println("Enter Phone Number");
			l = sc.nextLong();
		}
       System.out.println(PhoneNumber);
       System.out.println("Enter Phone Number to search in the list");
       long s = sc.nextLong();
       System.out.println(PhoneNumber.contains(s));
       
	}

}

package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Get_Store_Qstop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        ArrayList<Integer> al = new ArrayList<Integer>();
				@SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter a number:");
				String n = sc.next();
				while(!n.equals("q"))
				{
					Integer i = Integer.parseInt(n);
					al.add(i);
					System.out.println("Enter a number:");
					n = sc.next();
				}
				System.out.println("Stopped");
		        System.out.println(al);

	}

}

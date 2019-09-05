package arrays;

import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float salary;
		System.out.println("enter your salary");
		Scanner sc = new Scanner(System.in);
		salary = sc.nextFloat();
		if (salary <= 500000) {
			System.out.println(salary*0/100);
		} else if (salary > 500000 && salary < 1000000) {
			System.out.println(salary * 5 / 100);
		} else {
			System.out.println(salary * 10 / 100);
		}
		sc.close();
	}

}

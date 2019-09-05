package collection;

//import java.util.ArrayList;
import java.util.Scanner;

public class Get_Nnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<Integer> al = new ArrayList<Integer>();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		//while(n!=0)
		for(int i=n;i!=0;)
		{
			//al.add(n);
			System.out.println("Enter a number:");
			n = sc.nextInt();
			if(n==0)
				break;
		}
		System.out.println("Stopped");
       // System.out.println(al);
	}

}

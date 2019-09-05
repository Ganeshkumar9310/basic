package myfirstpackage;

public class Prime_no_flag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=19;
		boolean flag=false;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("not a prime number");
		}
		else
		{
			System.out.println("prime number");
		}
		

	}

}

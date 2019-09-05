package myfirstpackage;

public class Prime_no_counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=19;
		int counter=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				counter=counter+1;
			}
		}
		if(counter==2)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not a prime number");
		}

	}

}

package practice;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//12345
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
		}
System.out.println();
	}
		//square
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(" * ");
		}
System.out.println();
	}
		for(int k=1;k<=5;k++)
		{
			for(int l=5;l>=k;l--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
}
}

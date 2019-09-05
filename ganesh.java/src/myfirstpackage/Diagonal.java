package myfirstpackage;

public class Diagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=a;j++)
			{
				if(i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.println("");
				}
			}
			System.out.println();
		}

	}

}

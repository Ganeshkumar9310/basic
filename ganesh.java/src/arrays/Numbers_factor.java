package arrays;

public class Numbers_factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int num=1;num<=100;num++)
{
	System.out.print(num+" factors--->");
	for(int i=1;i<=num;i++)
	{
		if(num%i==0)
		{
			System.out.print(i+" ");
		}
	}
	System.out.println();
}
	}

}

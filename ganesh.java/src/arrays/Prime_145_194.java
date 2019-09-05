package arrays;

public class Prime_145_194 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int num=145;num<=194;num++)
{
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
		System.out.println(num);
	}
}
	}

}

package practice;

public class Niven_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=90;
		int copy=num;
		int n=0,sum=0;
		while(num>0)
		{
			n=num%10;
			sum=sum+n;
			num=num/10;
		}
            if(copy%sum==0)
            {
            	System.out.println("Niven number");
            }
            else
            {
            	System.out.println("not a niven number");
            }
	}

}

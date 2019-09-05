package arrays;

public class Print_Odd_even_elements_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4};
		int b[] = new int[a.length];
		int c[] = new int[a.length];
		int even = 0;
		int odd = 0; 
		System.out.println("Even Elements");
	    for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
			System.out.println(a[i]+" ");
			b[i] = a[i];
			even++;
			}
		}
	    System.out.println("Even count=" + even);
	    for(int i=0;i<b.length;i++)
	    {
			if(b[i]!= 0)
			{
				System.out.println(b[i]);
			}
	    }
	    System.out.println("Odd Element");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]+" ");
				c[i] = a[i];
				odd++;
			}
			System.out.println("odd count=" + odd);
			for(int j=0;j<c.length;j++)
			{
			if(c[j]!=0)
				System.out.println(c[j]);
			}
		}

	}

}

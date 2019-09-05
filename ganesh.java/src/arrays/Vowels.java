package arrays;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[]={'g','m','a','e','i','o','u'};
		char u[]={'a','e','i','o','u'};
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<u.length;j++)
			{
				int count=0;
				if(c[i]==u[j])
				{
					System.out.println(c[i]);
					count++;
				}
			}
		}

	}

}

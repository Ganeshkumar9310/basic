package arrays;

public class Maximum_of_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,0,6,8};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
        System.out.println("the element is:");
        for(int i=0;i<a.length;i++)
        {
        	System.out.println(a[i]);
        }
        System.out.println("Maximum element is:"+max);

	}

}

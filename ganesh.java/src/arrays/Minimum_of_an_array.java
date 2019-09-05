package arrays;

public class Minimum_of_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,0,6,8};
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
        System.out.println("the element is:");
        for(int i=0;i<a.length;i++)
        {
        	System.out.println(a[i]);
        }
        System.out.println("Minimum element is:"+min);
	}

}

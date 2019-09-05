package arrays;

public class Reverse_of_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {4,3,5,2,1};
		int temp;
		/*for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]+" ");
		}*/
		for(int i=0;i<a.length/2;i++)
		{
			temp = a[i];
			a[i] = a[a.length-1-i];
			a[a.length-1-i] = temp;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}

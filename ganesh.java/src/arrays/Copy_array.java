package arrays;

public class Copy_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {4,3,2,1};
		int b[] = new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i] = a[i];
			System.out.println(b[i]);
		}

	}

}

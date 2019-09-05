package arrays;

public class Divide_by_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,4,9,1,3};
		double b[] = new double[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i] = (double)a[i]/2;
			System.out.println(b[i]+" ");
		}

	}

}

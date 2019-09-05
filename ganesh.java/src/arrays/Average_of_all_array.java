package arrays;

public class Average_of_all_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,1,9,2};
		double sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum = sum+a[i]; //4.0
		}
System.out.println(sum/a.length);
	}

}

package arrays;

public class Random_6digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		int a[]=new int[7];
		for(int i=0;i<a.length;i++)
		{
			num=(int)((Math.random()*10000000));
			a[i]=num;
		}
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[j]+" ");
		}
		

	}

}

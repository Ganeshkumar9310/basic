package myfirstpackage;

public class Additionofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={7,3,6,4};
		int b[]={3,7,4,6};
		int d[]={4,4,4,4};
		int c[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i]+b[i]+d[i];
			System.out.println(c[i]);
		}

	}

}

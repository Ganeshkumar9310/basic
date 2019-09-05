package myfirstpackage;

public class Linearcomp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={7,11,1,3,9};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				System.out.println(a[i]+" and "+a[j]);
			}
		}

	}

}

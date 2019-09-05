package myfirstpackage;

public class Mergetwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[]={11,7,9,3,14};
		int y[]={5,2,3};
		int z[]=new int[x.length+y.length];
		for(int i=0;i<x.length;i++)
		{
			z[i]=x[i];
		}
		int jj=0;
		for(int i=x.length;i<z.length;i++)
		{
			z[i]=y[jj];
			jj++;
		}
		for(int i=0;i<z.length;i++)
		{
			System.out.println(z[i]);
		}
		int temp=0;
		for(int i=0;i<z.length;i++)
		{
			for(int j=i+1;j<z.length;j++)
			{
				if(z[i]>z[j]) //<//
				{
					temp=z[i];
					z[i]=z[j];
					z[j]=temp;
			}
		}
	}
	for(int i=0;i<z.length;i++)
	{
		System.out.println(z[i]);
	}

	}

}

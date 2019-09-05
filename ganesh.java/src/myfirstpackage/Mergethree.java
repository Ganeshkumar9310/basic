package myfirstpackage;

public class Mergethree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[]={3,5,7};
		int y[]={2,4,6,8};
		int k[]={1,9,0};
		int z[]=new int[x.length+y.length+k.length];
		for(int i=0;i<x.length;i++)
		{
			z[i]=x[i];
		}
		int j=0;
		for(int i=x.length;i<z.length;i++)
		{
			z[i]=y[j];
			j++;
		}
		for(int i=0;i<z.length;i++)
		{
			System.out.println(z[i]);
		}
				}
					}


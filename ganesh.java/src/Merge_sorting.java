package practice;

public class Merge_sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,3,5,7};
		int b[]={2,4,6};
		int max=a.length+b.length;
		int c[]=new int[max];
		int i=0,j=0,k=0;
		while(k<max)
		{
			if(i<a.length)
			{
				c[k]=a[i];
				i++;
				k++;
			}
			if(j<b.length)
			{
				c[k]=b[j];
				j++;
				k++;
			}
		}
		for(int v=0;v<c.length;v++)
		{
			System.out.println(c[v]+" ");
		}

	}

}

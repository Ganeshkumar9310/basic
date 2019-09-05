
public class Three_Union {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[] = { 11, 7, 9, };
		int y[] = { 5, 2, 3, 1 };
		int z[] = {3,1,2,10};
		int k[] = new int[x.length+y.length];
		int j[] = new int[k.length+z.length];
		for(int i=0;i<x.length;i++)
		{
			k[i] = x[i];		}
		int m=0;
		for(int i=x.length;i<k.length;i++)
		{
			k[i] = y[m];
			m++;
		}
		for(int l=0;l<k.length;l++)
		{
			j[l]=k[l];
		}
		int g=0;
		for(int l=k.length;l<j.length;l++)
		{
			j[l] = z[g];
			g++;
		}
		for(int l=0;l<j.length;l++)
		{
			System.out.println(j[l]+" ");
		}
	}

}
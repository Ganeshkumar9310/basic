package myfirstpackage;

public class Hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[] = {25,12,55,43,7,1000,57,68};
		//System.out.println(x[0]);
		//System.out.println(x[x.length/2]);
		if(x.length%2==0)
		{
			System.out.println(x[(x.length)/2-1]);
			System.out.println(x[(x.length)/2]);
		}
		else
		{
			System.out.println(x[(x.length)/2]);
		}

	}

}

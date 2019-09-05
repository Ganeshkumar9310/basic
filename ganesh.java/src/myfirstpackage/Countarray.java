package myfirstpackage;

public class Countarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[] = {25,12,55,43,7,1000,57,68,49};
		int count=0;
		for(int i=0;i<x.length;i++)
		{
			if(x[i]==55)
					{
				count = count++;
					}
		}
		System.out.println(count);

	}

}

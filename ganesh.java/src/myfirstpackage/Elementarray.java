package myfirstpackage;

public class Elementarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[] = {25,12,55,43,7,1000,57,68,49};
		boolean flag=false;
		for(int i=0;i<x.length;i++)
		{
			if(x[i]==55)
			{
				flag=true;
				break;
			}
		}
		if(flag)
			System.out.println("55 is found");
		else
			System.out.println("55 is not found");

	}

}

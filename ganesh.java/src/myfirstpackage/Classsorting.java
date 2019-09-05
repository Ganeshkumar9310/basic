package myfirstpackage;

public class Classsorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a[]={5.0,5.5,5.4,5.3,6.1};
		double temp=1;
		/*char a[]={'p','a','i','l','a','g','a','m'};
		char temp=1;*/
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j]) //<//
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
			}
		}
	}
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}


	}

}

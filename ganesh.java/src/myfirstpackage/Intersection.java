package myfirstpackage;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[] = { 11, 7, 9, 3, 14, 1,2,10 };
		int y[] = { 5, 2, 3, 1 };
		int z[] = {3,1,2,10};

		System.out.println("intersection of the three arrays");
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < y.length; j++) {
				for(int k=0;k<z.length;k++)
				{
					

					//if ((x[i] == y[j]&&x[i]==z[k])&&y[j]==x[i]&&y[j]==z[k]) {}
					if(x[i]==y[j])
					{
						if(y[j]==z[k])
						{
							System.out.println(z[k]);
							
						}
					}

				}
			}
		}
	}
}

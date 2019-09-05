package myfirstpackage;

public class union {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[] = { 11, 7, 9, 3, 14 };
		int y[] = { 5, 2, 3 };
		int z[] = new int[x.length + y.length];
		int temp = 0;
		System.out.println("union of two arrays");
		for (int i = 0; i < x.length; i++) {
			z[i] = x[i];
		}
		int k = 0;
		for (int i = x.length; i < z.length; i++) {
			z[i] = y[k];
			k++;
		}
		for (int i = 0; i < z.length; i++) {
			for (int j = i + 1; j < z.length; j++) {
				if (z[i] == z[j]) {
					z[i] = 0;
				}
				if (z[i] > z[j]) {
					temp = z[i];
					z[i] = z[j];// ascending
					z[j] = temp;
				}
			}
		}
		for (int i = 0; i < z.length; i++) {
			if (z[i] != 0) {
				System.out.println(z[i]);
			}
		}
	}

}

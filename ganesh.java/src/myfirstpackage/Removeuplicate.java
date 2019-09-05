package myfirstpackage;

public class Removeuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 7, 11, 7, 3, 9 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					a[j] = 0;
				}
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0)
				System.out.println(a[i]);
		}
	}

}

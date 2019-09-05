package myfirstpackage;

public class check {
	int c=1;
	{
		c=2;
	}
	check(int c)
	{
		this.c = c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check obj = new check(3);
		System.out.println(obj.c);
	}

}

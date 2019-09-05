package myfirstpackage;

class checkA
{
	int a=1;
	final void disp()
	{
		System.out.println(this.a);

	}
}
class checkB extends checkA
{
	int a=2;
	void display()
	{
		System.out.println(this.a+super.a);
	
	}
}
public class program {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkB b =new checkB();
		b.disp();
		b.display();
	}
		
	}



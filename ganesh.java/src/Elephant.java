package practice;

public class Elephant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="elephants";
		char c[]=s.toCharArray();
		if(c.length%3!=0)
		{
			System.out.println(s);
		}
		else if(c.length%3==0)
		{
			for(int i=2;i<c.length;i=i+3)
			{
				System.out.print(c[i]);
			}
		}
	}

}

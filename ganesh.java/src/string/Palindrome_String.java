package string;

public class Palindrome_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s="java";
		StringBuffer o=new StringBuffer("MALAYALAM");
		StringBuffer r=new StringBuffer(o);
		r.reverse();
	    String x=o.toString();
	    String y=r.toString();
		//System.out.println(r);
		if(x.equals(y))
		{
			System.out.println("P");
		}
		else
		{
			System.out.println("NP");
		}
	}
}

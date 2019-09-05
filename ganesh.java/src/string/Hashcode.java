package string;
class abc
{
	
}

public class Hashcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="ram";
		System.out.println(a.hashCode());
		String b="ram";
		System.out.println(b.hashCode());
		String c=new String("java");
		System.out.println(c.hashCode());
		String d=new String("java");
		System.out.println(d.hashCode());
		String e="sam";
		System.out.println(e.hashCode());
		abc o1=new abc();//different hashcode
		System.out.println(o1.hashCode());
		abc o2=new abc();
		System.out.println(o2.hashCode());

	}

}

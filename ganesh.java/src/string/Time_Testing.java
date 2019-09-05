package string;

public class Time_Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s="java";
		StringBuilder sb=new StringBuilder("java");//or buffer
		long start=System.currentTimeMillis();
		for(int i=1;i<=100000;i++)
		{
			sb.append("programming");
		}
        long end=System.currentTimeMillis();
        System.out.println(end-start+"ms");
	}

}

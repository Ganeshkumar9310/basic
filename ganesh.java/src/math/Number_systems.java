package math;

public class Number_systems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		for(int i=0;i<=n;i++)
		{
			System.out.println("\t"+i+"\t"+Integer.toBinaryString(i)+"\t"+Integer.toOctalString(i)+"\t"+Integer.toHexString(i)+"\t");
		}

	}

}

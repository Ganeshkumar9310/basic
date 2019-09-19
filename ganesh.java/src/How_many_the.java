package practice;

public class How_many_the {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="He is the best teacher in the college";
		String stn[]=s.split(" ");
		int count =0;
		for(int i=0;i<stn.length;i++)
		{
			if(stn[i].equalsIgnoreCase("the"))
					{
						count=count+1;
					}
		}
       System.out.println(count);
	}

}

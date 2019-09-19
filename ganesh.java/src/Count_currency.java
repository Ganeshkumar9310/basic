package practice;

public class Count_currency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount =998;
		countcurren(amount);

	}
	public static void countcurren(int amount)
	{
		int notes[]=new int[]
				{2000,500,200,100,50,20,10,5,1};
		int notescounter[]=new int[9];
		for(int i=0;i<9;i++)
		{
			if(amount>=notes[i])
			{
				notescounter[i]=amount/notes[i];
				amount=amount-notescounter[i]*notes[i];
			}
		}
		System.out.println("currency amount:");
		for(int i=0;i<9;i++)
		{
			System.out.println(notes[i]+"Rs count is :"+notescounter[i]);
		}
	}

}

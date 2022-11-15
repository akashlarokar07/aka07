package day4.com;


public class RecursionTest2 {
	
	public static void emptyVase( int flowerInvase)
	{
		if(flowerInvase > 0)
		{
			emptyVase(flowerInvase -1);
			System.out.println(">"+flowerInvase);
		}
		
		else
		{
			//Nothing
		}
	}
		
		public static void main(String[] args)
		{
			emptyVase(7);
		}
	}



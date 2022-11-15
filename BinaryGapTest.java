package example.binarygaptest;

import java.util.ArrayList;

public class BinaryGapTest {

	public static void main(String[] args) {
		
		int count = Solution.SolveThis(1040);
		System.out.println("Maximum 0's  = "+count);
	}
	
	 static class Solution
	{
		
		public static int SolveThis(int N)
		{
			String binaryRepresentation = Integer.toBinaryString(N);
			System.out.println(N+ "Binary :- "+binaryRepresentation);
			
			int longestGap = 0;
			
			ArrayList<Integer> onesList = new ArrayList<Integer>();
			
			for(int i=0; i<binaryRepresentation.length();i++)
			{
				if(binaryRepresentation.charAt(i)== '0')
				{
					continue;
				}
				onesList.add(i);
			}
			
			for(int i=0; i<onesList.size()-1;i++)
			{
				int indicesDifferecnce = onesList.get(i+1) - onesList.get(i)-1;
				
			}
			return longestGap;
		}
	}

}

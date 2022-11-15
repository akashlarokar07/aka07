/*
 * 							N = 1041
 *							| 
 *							|
 *							0 1 2 3 4 5 6 7 8 9 10 11
 *							1 0 0 0 0 0 1 0 0 0 0  1
 *							|		  			   |
 *							S		  			   E
 *
 *		Step 1:- convert this N into binary string representation.
 *		step 2:- 
 */

package day1.com;

import java.util.ArrayList;

public class BinaryNo 
{
			
	public static void main(String[] args) {
		
//		Solution.solveThis(100);
//		Solution.solveThis(1041);
	}
}
	class Solution
	{
		
		
		public static int solveThis(int N)
		{
			String binaryRepresentation = Integer.toBinaryString(N);
			int longestGap = 0;
			
			System.out.println("Binary Representation is :- "+binaryRepresentation);
			
			
			
			ArrayList<Integer> onesList = new ArrayList<Integer>();
			
			for (int i =0 ; i<binaryRepresentation.length(); i++)
			{
				if(binaryRepresentation.charAt(i)== '0')
				{
					continue;
					
					onesList.add(i);
				}
				
				for( i=0; i<onesList.size()-1;i++)
				{
					int indicesDifference = onesList.get(i+1) - onesList.get(i)-1 ;
							 longestGap = Math.max(longestGap, indicesDifference);
				}
				return longestGap;
			}
				
			
		}
		
	}
		

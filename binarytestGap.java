
package example.binarygaptest;

import java.util.ArrayList;

public class binarytestGap 
{
	public static void main(String[] args) 
	{
		int count =Solution.SolveThis(1041);
		System.out.println("max 0 count "+count);
	}
	
}
class Solution
	{
		public static int SolveThis(int N) 
		{
			String binary=Integer.toBinaryString(N);
			
			System.out.println(N+" Binary: "+binary);
			
			int longestGap=0;
			
			ArrayList<Integer> oneList=new ArrayList<Integer>();
			
			for(int i=0;i<binary.length();i++) {
				
				if(binary.charAt(i)=='0') {
					continue;
				}
				oneList.add(i);
			}
			for(int i=0;i<oneList.size()-1;i++) 
				{
					int indicesDifferecnce = oneList.get(i+1) - oneList.get(i)-1;
					longestGap= Math.max(longestGap, indicesDifferecnce);
				}
				
			return longestGap;
		}
	}


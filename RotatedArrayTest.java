/*
 * 	Pass source array and the Rotation Index as K
 * 
 * 		step 1:- Declare the targetArray as per the length of the sourceArray
 * 		step 2:- Iterate through the sourceArray from 0 to length
 * 		step 3:- Determine the rotationIndex as per the formula
 * 					rotationIndex = (i+k)% sourceArray.length;
 * 
 * 		SA 									TA
 * 		 i = 0	rotationIndex = (0+3)%5; =  3
 * 		 i = 1	rotationIndex = (1+3)%5; =  4
 * 		 i = 2	rotationIndex = (2+3)%5; =  0
 * 		 i = 3	rotationIndex = (3+3)%5; =  1
 * 		 i = 4	rotationIndex = (4+3)%5; =  2
 * 
 * 		step 4:- assign the i(th) value of the sourceArray to the rotationIndex(th) position of the targetArray
 * 		
 * 		step 5:- Return the targetArray.'
 * 
 */

package day2.com;

import java.util.Arrays;

public class RotatedArrayTest {

	public static void main(String[] args) {
		
		int SA[] = {3,8,9,7,6}; int K = 3;
		System.out.println("Before Rotaion:-"+Arrays.toString(SA));
		
		int rotatedArray[ ]= RotationTest.solution(SA , K );
		System.out.println("After Rotation:-"+Arrays.toString(rotatedArray));
		
	}

}
	class RotationTest
	{
			public static int[ ] solution(int sourceArray[], int K)
			{
				int targetArray[ ] = new int [sourceArray.length];
				
				for(int i=0; i<sourceArray.length;i++)
				{
					int rotationIndex = (i+K)% sourceArray.length;
					
					targetArray[rotationIndex] = sourceArray[i];
					
				}
				return targetArray;
			}
	}

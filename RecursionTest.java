package day4.com;

public class RecursionTest {

	public static void main(String[] args) {
		
		FactorialTest fac = new FactorialTest();
		
		long answer = fac.findFactorial(5);
		
		System.out.println("Factorial :- "+answer);

	}

}

	class FactorialTest
	{
		long findFactorial(int num)
		{
			long factorial = 1;
			while(num > 0)
			{
				factorial = factorial * num;
				num--;
			}
			return factorial;
		}
	
		long findFactorialAgain(int num)
		{
			if(num == 0)
				return 1;
			
			else
			{
				//System.out.println("num "+num);
				//answer =(num * findFactorialAgain (num-1)) ;
				//System.out.println("answer "+answer);
				long ans = num * findFactorial(num - 1);
				System.out.println(" Answner :- "+ans);
				return ans;
			}
		}
		

	}
	
	
	
	//natural invocation : num = 5 
//	return value : 5 * (num-1)[4] = 20

//	return value : 4 * (num-1)[3] = 20

/*int number=7;
long factAns = fact.findFactorial(number);
System.out.println("Factorial of : "+number +" is " + factAns);*/


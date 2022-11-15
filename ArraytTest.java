package day1.com;

public class ArraytTest {
	
	public static void main(String[] args) {
		
		Account accArray[] = new Account[5];
		
		//System.out.println(accArray[0]);
		
		Account accobj = new Account(101,"Akash",10101);
		System.out.println("Account Details :- "+accobj);	// will invokes toString() of
		
		
	}
	}
	
	class Account
	{
		private int accountNumber;
		private String accountHolderName;
		private float accountBalance;
		
		
		public Account(int accountNumber, String accountHolderName, float accountBalance) {
			super();
			this.accountNumber = accountNumber;
			this.accountHolderName = accountHolderName;
			this.accountBalance = accountBalance;
		}
		
		float withDraw(float amtToWithdraw) {
			accountBalance = accountBalance - amtToWithdraw;
			return accountBalance;
		}
		
		

		@Override
		public String toString() {
			return "Account [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName
					+ ", accountBalance=" + accountBalance + "]";
		}
		
	}


/*
 * 		1. Function without argument and without return type
 * 			
 * 				void clearScreen(void)
 * 					{
 * 						}
 * 
 * 		
 * 		2. Function with Argument but without return value
 * 				
 * 				void gotoThisLocation(float longitude , float latitude)
 * 						{
 * 							}
 * 
 * 
 * 		3. Function with Argument and with return value
 * 				
 * 				float calculateSimpleIntrest(float prinAmt , int numYears , float rate)
 * 					{
 * 						float interest = (prinAmt * numYears * rate)/100;
 * 							return interest;
 * 
 * 					}
 * 				
 * 
 * 		4. Function without argument but with return value
 * 			
 * 			double calculateDistance()
 * 				{
 * 					float speedOfLight = 186000.519; // miles/sec
 * 					int timeTook = 480;	// seconds 
 * 					double distance = speedOfLight * timeTook;
 * 					return speedOfLight;
 * 
 * 		
 * 
 * 
 */

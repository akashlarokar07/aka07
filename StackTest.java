package day2.com;

public class StackTest {

	public static void main(String[] args) {
		
		
		MyStack theStack = new MyStack(5);
		theStack.push(10);
		theStack.push(20);
		theStack.push(30);
		theStack.push(40);
		theStack.push(50);
		//theStack.push(60);
		
		
		System.out.println("=> element of the top :- "+theStack.peek());
		
		System.out.println(theStack.pop());
		System.out.println("=> element of the top :- "+theStack.peek());
		
		
			System.out.println(""+theStack.pop());
			System.out.println(""+theStack.pop());
			System.out.println(""+theStack.pop());
			System.out.println(""+theStack.pop());
			System.out.println(""+theStack.pop());
			System.out.println(""+theStack.pop()); // here pop one more element from stack which have size of 5 then it will give Exception Stack is Empty.
			
	}

}

	class MyStackOverflowException extends RuntimeException
	{
		public MyStackOverflowException(String str)
		{
			super(str);
		}
	}
		class MyStackEmptyException extends RuntimeException
		{
			MyStackEmptyException(String str){
				super(str);
			}
		}
	class MyStack
	{	
		int index = -1;
		int size;
		int array[];	// It is just a reference to the int array.
		
		MyStack(int size)
		{
			System.out.println("MyStack Created with "+ size + " integers ");
			this.size = size;
			
			array = new int[size];	// Allocation of the ints
		}
		
		void push(int item )
		{
			System.out.println("Pushing :- "+item+" to the Stack..");
			
			if(index > size -2 )  // here size-2 is for to handle the Overflowing the stack.
			{
				throw new MyStackOverflowException("Stack size is Overflow...");
				
			}
			array [++index] = item;
			//array[++index] = item;
			//int top = index;
			
		}
		
		int pop()
		{
			System.out.println("Popping item from the Stack...");
			if(index < 0)
			{
				throw new MyStackEmptyException("Stack is empty...");
			}
			return array[index--];	
		}
		
		int peek( )
		{	
			
			return array[index];
		}
	}
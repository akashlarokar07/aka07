package day2.com;

public class QueueTest {

	public static void main(String[] args) {
		
		MyQueue que = new MyQueue(5);
		
		que.add(10);
		que.add(20);
		que.add(30);
		que.add(40);
		que.add(50);
		//que.add(60);
		
				System.out.println("Element 1:- "+que.remove());
				System.out.println("Element 2:- "+que.remove());
				System.out.println("Element 3:- "+que.remove());
				System.out.println("Element 4:- "+que.remove());
				System.out.println("Element 5:- "+que.remove());
				//System.out.println("Element 6:- "+que.remove());
		

	}

}
	class MyQueueOverflowException extends RuntimeException
	{
		public MyQueueOverflowException(String str)
		{
			super(str);
		}
	}
		class MyQueueEmptyException extends RuntimeException
		{
			MyQueueEmptyException(String str){
				super(str);
			}
		}

	class MyQueue
	{
		int length;
		int array[];
		int index = -1;
		 MyQueue(int length) {
			
			 this.length = length;
			 
			 array = new int [length];
			 
		}
		 void add(int item)
		 {
			 if(index > length-2)
			 {
				 throw new MyQueueOverflowException("Queue is Over Flow.....");
			 }
			 array[++index] = item;
			 System.out.println("added "+item+ " at index "+index);
		 }
		 
		 int remove()
		 {
			 if(index < length)
			 {
				 throw new MyQueueEmptyException("Queue is Empty...");
			 }
			 return array[length - index-- -1];
		 }
	}

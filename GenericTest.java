package day3.com;

public class GenericTest {
		public static void swap(Integer x , Integer y)
		{
			System.out.println("Swapping..."+x.hashCode()+","+y.hashCode());
			Integer temp = x;
			x=y;
			y=temp;
			
			System.out.println("Swapped.....");
		}

	public static void main(String[] args) {
		
		Integer x = 10;
		Integer y = 20;
		
		System.out.println("Main..."+x.hashCode()+","+y.hashCode());
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
		swap(x,y);
		
		
		System.out.println("x = "+x);
		System.out.println("y = "+y);

	}

}

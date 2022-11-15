/*
 * 
 * 
 * 
 * 	stack						heap
 * 
 * 						color	owner	length  flying   next
 * 					----------------------------------------------
 * 					| red	|jack		|50		|true	|200	|
 * 					----------------------------------------------
 * 	+-------------->100
 * 	|			
 *  100
 * 	k1
 * 
 * 					color	owner	length  flying      next
 * 					----------------------------------------------
 * 					| green	|jane		|60		|true	| 300	|
 * 					----------------------------------------------
 * 	+-------------->200
 * 	|			
 *  200
 * 	k2
 * 
 * 					color	owner	length  flying       next
 * 					----------------------------------------------
 * 					| blue	|john		|80		|true	|	|
 * 					----------------------------------------------
 * 	+-------------->300
 * 	|	
 * 300		
 * 	k3
 * 
 * 
 * 
 */
 

package day1.com;

public class LinkedListTest {

	public static void main(String[] args) {
		
		Kite k1 = new Kite("Red","Jack",50,true);
		Kite k2 = new Kite("Green","Jane",60,true);
		Kite k3 = new Kite("Blue","Jonh",80,true);
		Kite k4 = new Kite("Yellow","Julie",90,true);
		Kite k5 = new Kite("Black","Jim",70,true);
		
		k1.next = k2;
		k2.next = k3;
		k3.next = k4;
		k4.next = k5;
		
		
		System.out.println("k1 :- "+k1);
		System.out.println("k2 :- "+k2);
		System.out.println("k3 :- "+k3);
		System.out.println("k4 :- "+k4);
		System.out.println("k5 :- "+k5);
		
		System.out.println("-----------------------");
		
		System.out.println("k1 :- "+k1.hashCode());//100
		System.out.println("k2 :- "+k2.hashCode());//200
		System.out.println("k3 :- "+k3.hashCode());//300
//		System.out.println("k4 :- "+k4);
//		System.out.println("k5 :- "+k5);
		
		System.out.println("-----------------------");
		
		System.out.println("k1 :- "+k1.next.hashCode());//200
		System.out.println("k2 :- "+k2.next.hashCode());//300
		System.out.println("k3 :- "+k3.next.hashCode());//400
		System.out.println("k4 :- "+k4.next.hashCode());//500
		System.out.println("k5 :- "+k5.next);
		
		
		// Self Referential data structure

	}

}

	class Kite
	{
		String color;
		String owner;
		int length;
		boolean flying;
		
		Kite next;	// self referential data structure

		public Kite(String color, String owner, int length, boolean flying) {
			super();
			this.color = color;
			this.owner = owner;
			this.length = length;
			this.flying = flying;
			
		}

		@Override
		public String toString() {
			return "Kite [color=" + color + ", owner=" + owner + ", length=" + length + ", flying=" + flying + ",\n\t next="
					+ next + "]";
		}
		
	}
	
	
	/*
	 * 			Kite next1 = k1;
	 * 			Kite next2 = k2;
	 * 			Kite next3 = k3;
	 * 
	 * 		System.out.println("next1 : "next1);
	 * 		System.out.println("next2 : "next2);
	 * 		System.out.println("next3 : "next3);
	 * 
	 * 
	 * 		System.out.println("next1 : "next1.hashCode());
	 * 		System.out.println("next2 : "next2.hashCode());
	 * 		System.out.println("next3 : "next3.hashCode());
	 * 
	 * 
	 */
	

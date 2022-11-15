package day5.com;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeTest {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		System.out.println("Container Created........");
		
		System.out.println("Adding 1st Value...");
		ts.add(10);
		
		System.out.println("Adding 2nd Value...");
		ts.add(20);

		System.out.println("Adding 3rd Value...");
		ts.add(5);
		
		System.out.println("Adding 4th Value...");
		ts.add(15);
		
		System.out.println("Adding 5th Value...");
		ts.add(3);
		
		System.out.println("Adding 6th Value...");
		ts.add(8);
		
		System.out.println("Adding 7th Value...");
		ts.add(25);
		
		
		
		Iterator<Integer> integerIterator = ts.iterator();
		System.out.println("Retrived the iterator....");
		
		
		while(integerIterator.hasNext())
		{
			Integer theValue = integerIterator.next();
			System.out.println("Integer Value :- "+theValue);
		}
	}

}

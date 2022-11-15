package day4.com;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListContainerTestExample {

	public static void main(String[] args) {
		
		Kites k1 = new Kites("Red","Jack",50,true);
		Kites k2 = new Kites("Green","Jane",60,true);
		Kites k3 = new Kites("Blue","John",80,true);
		Kites k4 = new Kites("Yellow","Julie",90,true);
		Kites k5 = new Kites("Black","Jim",75,true);

		MyLinkedList myList = new MyLinkedList();
		
		myList.showList();
		
			myList.add(k1);
			myList.add(k2);
			myList.add(k3);
			myList.add(k4);
			myList.add(k5);
			
	
			
		myList.showList();
		myList.deleteNodeByOwner("John");
		myList.showList();
		myList.size();
		
		
//		LinkedList myList1 = new LinkedList();
//		
//		myList1.add(k1);
//		myList1.add(k2);
//		myList1.add(k3);
//		myList1.add(k4);
//		myList1.add(k5);
//		
//		Iterator iter = myList1.iterator();
//		
//			while(iter.hasNext())
//			{
//				Kites k = (Kites) iter.next();
//				System.out.println("k :- "+k);
//			}
		
	//	myList.searchKiteBylength(50);
			
//		myList.addAtBegining(k5);
//		System.out.println(".............................");
//		myList.showList();
		
		//myList.searchKiteByName("Jane");
		
		
		//myList.deleteWithLength(90);
		
		//myList.showList();
		//myList.size();
	}

}

	class MyLinkedList
	{
		Kites start;
		Kites ptr;
		Kites prev;
		int size;
		
		void showList()
		{
			if(start==null)
			{
				System.out.println("List is Empty");
				
			}
			
			else
			{
				System.out.println("List is not Empty");
				
					ptr = start;
					while(ptr!=null)
					{
						System.out.println("Data :- "+ptr);
						ptr=ptr.next;
					}
			}
		}
		
			void insertKite(String ownerToFind, Kites newKite)
			{
				boolean found = false;
				
				if(start == null)
				{
					System.out.println("List is Empty... can't add this Object");
					
				}
				else if(start.owner.equals(ownerToFind))
				{
					addAtBegining(newKite);
				}
				else
				{
					ptr = start;
					while(ptr != null)
					{
						if(ptr.owner.equals(ownerToFind))
						{
							found = true;
							break;
						}
						prev = ptr;
						ptr = ptr.next;
						
					}
					if(found==true)
					{
						prev.next = newKite;
						newKite.next = ptr;
						size++;
						System.out.println("Inserted the Node before..."+ownerToFind);
					}
					else
					{
						System.out.println("Object Not Found...."+ownerToFind);
					}
				}
				
			}
			
			
		void deleteNodeByOwner(String ownerName)
		{
			boolean found = false;
			
			if(start == null)
			{
				System.out.println("List is Empty.. Nothing to delete. ");
				
			}
		else if(start.owner.equals(ownerName))
			{
				prev = start;
			start = start.next;
				prev.next = null;
				System.out.println("Deleted Owner from the Begining..");
			}
			else
			{
				ptr = start;
				while(ptr==null)
				{
					if(ptr.owner.equals(ownerName))
					{
						found = true;
						break;
					}
					prev = ptr;
					ptr = ptr.next;
				}
				
				if(found == true)
				{
					prev.next = ptr.next;
					System.out.println("Internal Object deleted.. by Owner Name");
					ptr.next = null;
					ptr = null;
					
					
				}
				else
				{
					System.out.println("Owner Name NOT FOUND....");
				}
			}
		}
		
		
		void deleteKite(Kites theKite)
		{
			boolean found = false;
			
			if(start == null)
			{
				System.out.println("List is Empty... Nothing to delete");
			}
			else if(start == null)
			{
				prev = start;
				start = start.next;
				prev.next = null;
				System.out.println("Deleted Kite from the begining");
				
			}
			else 
			{
				ptr = start;
				while(ptr!=null)
				{
					if(ptr == theKite)
					{
						found = true;
						break;
					}
					prev = ptr;
					ptr = ptr.next;
				}
				if(found == true)
				{
					prev.next = ptr.next;
					System.out.println("Internal Object Deleted by Kite Reference");
					ptr.next = null;
					ptr = null;
				}
				else
				{
					System.out.println("Kite NOT FOUND");
				}
			}
		}
		
			
		void searchKiteBylength(int lengthTosearch)
		{
			boolean found = false;
			
			if(start==null)
			{
				System.out.println("List is Empty, nothing to Search");
				
			}
			else 
			{
				System.out.println("List is not Empty, Searching");
				
					ptr = start;
					while(ptr!=null)
					{
						if(ptr.length==lengthTosearch)
						{
							System.out.println("Kite Found :- "+ptr);
								found = true;
								break;
						}
						ptr = ptr.next;
					
						if(found!=true)
						{
							System.out.println("Kite is not Found of this Length"+lengthTosearch);
						}
					}
				}
			}
		
			void searchKiteByName(String OwnerToSearch)
			{
				boolean found = false;
				
				if(start==null)
				{
					System.out.println("List is Empty, Nothing to Search");
					
				}
				else
				{
					System.out.println("List is not Empty, Searching");
					ptr = start;
					while(ptr!=null)
					{
						if(ptr.owner==OwnerToSearch)
						{
							System.out.println("Owner Found :-"+ptr);
								found = true;
								break;
						}
							ptr = ptr.next;
							if(found!=true)
							{
								System.out.println("Owner Not Found of this Name"+OwnerToSearch);
							}
					}
				}
			}
		
		void addAtBegining(Kites newKite)
		{
			if(ptr!=null)
			{
				System.out.println("This Kite is added at the Begining of the existing list of Kites");
						newKite.next = start;
						start = newKite;
						size++;
			
			}
			else
			{
				System.out.println("You are the First Kite");
					start = newKite;
					size++;
				
			}
		}
		
		
		void deleteWithLength(int lengthToDelete)
		{
			if(start==null)
			{
				System.out.println("List is Empty ");
			}
			else
			{
				ptr = start;
				while(ptr!=null)
				{
					if(ptr.length==lengthToDelete)
					{
						System.out.println("Delte the Kite:- "+lengthToDelete);
						prev.next = ptr.next;
					}
						prev = ptr;
						ptr = ptr.next;
						
				}
					size--;
			}
			
				
		}
		
		
		void add(Kites newKites)
		{
			
			if(start==null)
			{
				System.out.println("Add First Node....");
				
				start = newKites;
				
				start.next = null;
				size++;
			}
			else
			{
				System.out.println("Adding Internal Nodes");
				
				ptr = start;
				
				while(ptr!=null)
				{
					System.out.println("Searching....");
					prev = ptr;
					ptr = ptr.next;
				}
				prev.next = newKites;
				newKites = null;
				size++;
				
			}
		}
			void size()
			{
				System.out.println("Size :- "+size);
			}
	}
	
		
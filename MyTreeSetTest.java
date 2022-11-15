package day5.com;

import java.util.Scanner;

public class MyTreeSetTest {

	public static void main(String[] args) {
		
		ChemicalElement gold = new ChemicalElement(79,"Gold","Au",196.97f); 
		
		ChemicalElement silver = new ChemicalElement(47,"Silver","Ag",107.87f); 
		
		ChemicalElement radium = new ChemicalElement(88,"Radium","Ra",226.03f); 
		
		ChemicalElement calcium = new ChemicalElement(20,"Calcium","Ca",40.08f); 
		
		ChemicalElement tin  = new ChemicalElement(50,"Tin","Sn",118.711f);
		
		ChemicalElement lead = new ChemicalElement(82,"Lead","Pb",207.2f); 
		
		ChemicalElement uranium  = new ChemicalElement(92,"Uranium","U",238.29f);

		Scanner sc = new Scanner(System.in);
		
		MyTreeSet myTreeSet = new MyTreeSet();
		
		
		int choice = 0;
		
		do
		{
			
			System.out.println("1. Insert an Element ");
			System.out.println("2. Delete an Element ");
			System.out.println("3. InOrder Traversal ");
			System.out.println("4. PreOrder Traversal ");
			System.out.println("5. PostOrder Traversal ");
			System.out.println("6. Exit ");
			
			choice = sc.nextInt();
			
				switch(choice)
				{
				case 1:
						myTreeSet.insert();
							break;
				case 2:
						break;
				case 3:
						myTreeSet.inOrder(myTreeSet.root);
							break;
				case 4:
						break;
				case 5:
						break;
				case 6:
						break;
				}
			
	
			
		}while(choice!=6);
		
	}

}


	class MyTreeSet // Container
	{
		ChemicalElement root = null, temp;
		
		//Function to Add
		
		void insert()
		{
			create();
			if(root == null )
			{
				root = temp;
			}
			else
			{
			
			}
		}
		
		void create()
		{
			System.out.println("Enter Atomic Number :- ");
			Scanner sc = new Scanner(System.in);
			
			int tempAtomicNumber = sc.nextInt();
			
			temp = new ChemicalElement();
			temp.atomicNumber = tempAtomicNumber;
			
			temp.left = null;
			temp.right = null;
			
		}
		
		void search(ChemicalElement ce)
		{
			if((temp.atomicNumber > ce.atomicNumber) && (ce.right!=null))
				search(ce.right); // Recursive Call
			
			else if((temp.atomicNumber > ce.atomicNumber) && (ce.right!=null))
				ce.right = temp; // Assigning the Node
			
			
			else if((temp.atomicNumber < ce.atomicNumber) && (ce.left!=null))
				search(ce.left); // Recursive Call
			
			else if((temp.atomicNumber < ce.atomicNumber) && (ce.left!=null))
				ce.left = temp; // Assigning the Node
		}
		
		void inOrder(ChemicalElement ce)
		{
			if(root == null) {
				System.out.println("No Elements to show in the Tree");
				return ;
			}
			
			if(ce.left!=null)
				inOrder(ce.left);
			
			System.out.println("Data :- "+ce);
			
			if(ce.right!=null)
				inOrder(ce.right);
		}
	
		
	}
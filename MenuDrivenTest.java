package day4.com;

import java.util.Scanner;

public class MenuDrivenTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Make Object of Linked List
		
		MyLinkedList myList = new MyLinkedList();
		
		Kites k1 = new Kites("Red","Jack",50,true);
		Kites k2 = new Kites("Green","Jane",60,true);
		Kites k3 = new Kites("Blue","John",80,true);
		Kites k4 = new Kites("Yellow","Julie",90,true);
		Kites k5 = new Kites("Black","Jim",75,true);
		
		int choice = 0;
		
		do
		{
			System.out.println("--------------------------------");
			
			System.out.println("M  E  N  U");
			
			System.out.println("--------------------------------");
			
			System.out.println("Ente the Choice:- "+choice);
			
			System.out.println("1. Add Node at the Begining");
			System.out.println("2. Add Node at the End");
			System.out.println("3. Add Node at the a Specific Position");
			System.out.println("4. Search Node By Name");
			System.out.println("5. Search Node By Length");
			System.out.println("6. Delete Node By Length");
			System.out.println("7. Delete Node By Owner Name");
			System.out.println("8. Delete the Node");
			System.out.println("9. Show all Nodes");
			
			System.out.println("10. Exit");
			System.out.println("---------------------------------");
			
			choice = scan.nextInt();
			
			switch(choice)
			{
			case 1: myList.addAtBegining(new Kites());
						break;
			
			case 2: myList.add(new Kites());
						break;
						
			case 3: myList.insertKite(null, null);
						break;
						
			case 4: myList.searchKiteByName(null);
						break;
			
			case 5: myList.searchKiteBylength(90);
						break;
						
			case 6: myList.deleteWithLength(choice);
						break;
						
			case 7: myList.deleteNodeByOwner(null);
						break;
						
			case 8: myList.deleteKite(null);
						break;
			
			case 9: myList.showList();
						break;
			}
		}
		while(choice!=10);
	}

}

package day4.com;

public class DoubleyLinkedListTest {

	public static void main(String[] args) {
		MySong ms1 = new MySong("Jaisi Ho Waisi Raho", "Pavitra Rishta", "Yasser Desai",2009);
		MySong ms2 = new MySong("Mile Ho Tum Humko", "Reprise Version", "Neha Kakkar",2016);
		MySong ms3 = new MySong("Phir Mohabbat", "Murder 2", "Arijit Singh",2012);
		MySong ms4 = new MySong("Aadat", "Kalyug", "Atif Aslam",2013);
		MySong ms5 = new MySong("I Am In Love", "Once Upon In Time In Mumbai", "KK",2018);
		
		MySong ms6 = new MySong("Zaroori Tha", "Zaroori Tha", "Rahat Fateh Ali Khan", 2014);
		
		
		
		DoubleyLinkedList dllList = new DoubleyLinkedList();
		dllList.showAllSongs();
		
		dllList.addSong(ms1);
		dllList.addSong(ms2);
		dllList.addSong(ms3);
		dllList.addSong(ms4);
		dllList.addSong(ms5);
		
		dllList.showAllSongs();
		
		dllList.InsertSong(ms4, ms6);
		dllList.showAllSongs();
	}

}


	class MySong
	{	
		//Data Part
		String title;
		String ablum;
		String artist;
		int year;
		
		//Link Part
		MySong prev;
		MySong next;
		
		public MySong(String title, String ablum, String artist, int year) {
			super();
			this.title = title;
			this.ablum = ablum;
			this.artist = artist;
			this.year = year;
		}


		@Override
		public String toString() {
			return "MySong [title = " + title + ", ablum = " + ablum + ", artist = " + artist + ", year = " + year + "]";
		}
		
		
	}
	
		class DoubleyLinkedList
		{
			MySong start = null , ptr;
			
			void addSong(MySong newSong) {
				
				if(start == null)
				{
					System.out.println("Juke box is Empty...");
					start = newSong;
					start.prev = null;
					start.next = null;
					System.out.println("Added the First Song");
				}
				else if(start.next == null) {
					start.next = newSong;
					newSong.prev = start;
					newSong.next = null;
					System.out.println("Added the Second Song");
				}
				else
				{
					ptr = start.next;
					
					while(ptr.next != null)
					{
						ptr = ptr.next;
					}
					ptr.next = newSong;
					newSong.prev = ptr;
					newSong.next = null;
					System.out.println("Added the Internal Song");
				}
			}
			
				void showAllSongs()
				{
					if(start == null)
					{
						System.out.println("Juke Box is Empty...");
						
					}
					else
					{
						ptr = start;
						
						while(ptr!=null)
						{
							System.out.println("Data :- "+ptr);
					System.out.println("-----------------------------------------------------------------------------------------------");
							ptr = ptr.next;
						}
					}
				}
				
			void InsertSong(MySong AddBeforeSong , MySong SongToAdd)
			{
				boolean found = false;
				if(start == null)
				{
					System.out.println("List is Empty...., Can't Add Song");
				}
				else if(start.next == null)
				{
					System.out.println("Only One Song is Present in the List");
					SongToAdd.next = start;
					SongToAdd.prev = null;
					start.next = null;
				}
				else
				{
					ptr = start;
					while(ptr!=null)
					{
						if(ptr == AddBeforeSong)
						{
							System.out.println("Found Given Song "+AddBeforeSong);
								found = true;
								break;
						}
							ptr = ptr.next;
					}
					if(found == true)
					{
						System.out.println("Inserting the Song "+SongToAdd);
						SongToAdd.prev = ptr.prev;
						SongToAdd.prev.next = SongToAdd;
						SongToAdd.next = ptr;
						ptr.prev = SongToAdd;
					}
					else if(found!=true)
					{
						System.out.println("Can't Find the Given Song...");
					}
				}
					
			}
			
			
			
				
		}
		
			
	
	
	
	
	/*
	 * delete node
	 * insert node
	 * 
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
package day3.com;

import java.util.LinkedList;

public class GenericTest2 {

	public static void main(String[] args) {
		
		LinkedList myList = new LinkedList();
		
		MyValues mi = new MyValues(10,20);
		mi.print();
		mi.swap();
		mi.print();
		
		System.out.println("............................");
		
		Song s1 = new Song("My Heart will Go On","Titanic","Celine D",1997);
		Song s2 = new Song("Zhingat", "Sairat","Ajay-Atul",2016);
		
		MyValues<Song> jukeBox = new MyValues<Song>(s1,s2);
		
		jukeBox.print();
		jukeBox.swap();
		jukeBox.print();

	}

}

	class MyValues<AnyType>
	{
		AnyType x;
		AnyType y;
		
			MyValues(AnyType x , AnyType y)
			{
				this.x = x;
				this.y = y;
				
			}
			
			void swap()
			{
				System.out.println("Swapping......");
				AnyType temp = x;
						x = y;
						y = temp;
				System.out.println("Swapped.....");
			}
			
			void print()
			{
				System.out.println("x = "+x);
				System.out.println("y = "+y);
			}
	}
	
	
/*
 *		class MyIntegers
{
	int x;
	int y;
	
	MyIntegers(int x,int y) {
		this.x=x;
		this.y=y;
	}
	void print() {
		System.out.println("x "+x);
		System.out.println("y "+y);
	}
	void swap()
	{
		System.out.println("swapping....");
		int temp=x;
		x=y;
		y=temp;
		System.out.println("swapped...");
	}
}

class MyFloats
{
	float x;
	float y;
	
	MyFloats(float x,float y) {
		this.x=x;
		this.y=y;
	}
	void print() {
		System.out.println("x "+x);
		System.out.println("y "+y);
	}
	void swap()
	{
		System.out.println("swapping....");
		float temp=x;
		x=y;
		y=temp;
		System.out.println("swapped...");
	}
}


class MySongs
{
	Song x;
	Song y;
	
	MySongs(Song x,Song y) {
		this.x=x;
		this.y=y;
	}
	void print() {
		System.out.println("x "+x);
		System.out.println("y "+y);
	}
	void swap()
	{
		System.out.println("swapping....");
		Song temp = x;
		x=y;
		y=temp;
		System.out.println("swapped...");
	}
} 
 */
	
		class Song
		{
			String title;
			String album;
			String artist;
			int year;
			
			public Song(String title, String album, String artist, int year) {
				super();
				this.title = title;
				this.album = album;
				this.artist = artist;
				this.year = year;
			}

			@Override
			public String toString() {
				return "Song [title=" + title + ", album=" + album + ", artist=" + artist + ", year=" + year + "]";
			}
			
		}

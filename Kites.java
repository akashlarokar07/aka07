package day4.com;

public class Kites {
	
	String color;
	String owner;
	int length;
	boolean flying;
	
		Kites next;	// Self Referential data Structure.

		public Kites() {
			super();
		}

		public Kites(String color, String owner, int length, boolean flying) {
			super();
			this.color = color;
			this.owner = owner;
			this.length = length;
			this.flying = flying;
			
		}

		@Override
		public String toString() {
			return "Kites [color=" + color + ", owner=" + owner + ", length=" + length + ", flying=" + flying + "]";
		}
		
		
}

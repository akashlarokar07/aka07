package day5.com;

import java.util.Iterator;
import java.util.TreeSet;

public class ChemicalTreeSetExample {

	public static void main(String[] args) {
		
		ChemicalElement gold = new ChemicalElement(79,"Gold","Au",196.97f); //R
		
		ChemicalElement silver = new ChemicalElement(47,"Silver","Ag",107.87f); //L
		
		ChemicalElement radium = new ChemicalElement(88,"Radium","Ra",226.03f); //R
		
		ChemicalElement calcium = new ChemicalElement(20,"Calcium","Ca",40.08f); // L L
		
		ChemicalElement tin  = new ChemicalElement(50,"Tin","Sn",118.711f);// L R
		
		ChemicalElement lead = new ChemicalElement(82,"Lead","Pb",207.2f); // R L
		
		ChemicalElement uranium  = new ChemicalElement(92,"Uranium","U",238.29f);// R R

		
		TreeSet<ChemicalElement> periodicTableSet = new TreeSet<ChemicalElement>();
		System.out.println("Container Created........");
		
		
		System.out.println("Adding the 1st Value...");
		periodicTableSet.add(gold);
		
		System.out.println("Adding the 2nd Value...");
		periodicTableSet.add(silver);
		
		System.out.println("Adding the 3rd Value...");
		periodicTableSet.add(radium);
		
		System.out.println("Adding the 4th Value...");
		periodicTableSet.add(calcium);
		
		System.out.println("Adding the 5th Value...");
		periodicTableSet.add(tin);
		
		System.out.println("Adding the 6th Value...");
		periodicTableSet.add(lead);
		
		System.out.println("Adding the 7th Value...");
		periodicTableSet.add(uranium);
		
		
		Iterator<ChemicalElement> periodicTableIterator = periodicTableSet.iterator();
		System.out.println("Retrived the iterator...");
		
		while(periodicTableIterator.hasNext())
		{
			ChemicalElement theElement = periodicTableIterator.next();
			System.out.println("Element :- "+theElement);
		}
		
		
		
		
	}

}

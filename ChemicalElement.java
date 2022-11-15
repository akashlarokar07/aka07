package day5.com;

public class ChemicalElement implements Comparable<ChemicalElement>{
	
	int atomicNumber;
	String atomicName;
	String atomicFormula;
	float atomicWeight;
	
	ChemicalElement left;
	ChemicalElement right;
	
	public ChemicalElement() {
		super();
	}


	public ChemicalElement(int atomicNumber, String atomicName, String atomicFormula, float atomicWeight) {
		super();
		this.atomicNumber = atomicNumber;
		this.atomicName = atomicName;
		this.atomicFormula = atomicFormula;
		this.atomicWeight = atomicWeight;
	}


	@Override
	public String toString() {
		return "ChemicalElement [atomicNumber = " + atomicNumber + ", atomicName = " + atomicName + ", atomicFormula="
				+ atomicFormula + ", atomicWeight = " + atomicWeight + "]";
	}

	
	@Override	// here we compare with atomicName.
	public int compareTo(ChemicalElement o) {
		System.out.println("Comparing :- " +atomicNumber+ " with " +o.atomicNumber);
		return atomicName.compareTo( o.atomicName);
	
	}

	// here we Compare with atomicNumber.
//	@Override  
//	public int compareTo(ChemicalElement o) {
//		System.out.println("Comparing :- " +atomicNumber+ " with " +o.atomicNumber);
//		return Integer.compare(atomicNumber, o.atomicNumber);
//	
//	}

	
}

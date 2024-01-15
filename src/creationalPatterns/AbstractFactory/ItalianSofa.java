package creationalPatterns.AbstractFactory;

class ItalianSofa implements Sofa {
	
	public ItalianSofa(){
		System.out.println("Italian Sofa");
	}

	public void designLegs() {
		System.out.println("Italian legs");
	}
	
	public void designMaterials() {
		
		System.out.println("Italian materials");
		
	}
}

package creationalPatterns.AbstractFactory;

public class AmericanSofa implements Sofa {

	public AmericanSofa(){
		System.out.println("American Sofa");
	}
	public void designLegs() {
		System.out.println("American Legs");
	}
	
	public void designMaterials() {
		System.out.println("American materials");
	}
}

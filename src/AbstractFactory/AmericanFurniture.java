package AbstractFactory;

class AmericanFurniture implements Furnitureabsfac {
	
	
	public AmericanFurniture() {
		System.out.println("Inside American Furniture");
	}
	

	@Override
	public Chair createChair() {
		// TODO Auto-generated method stub
		
		return new AmericanChair();
	}

	@Override
	public Sofa createSofa() {
		// TODO Auto-generated method stub
		
		

		return new AmericanSofa();
	}
	
}

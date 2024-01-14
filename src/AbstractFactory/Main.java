package AbstractFactory;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter type of furniture you need");
		String input;
		
		input = sc.next();
		
		if(input.equals("American")) {
			
			AmericanFurniture af = new AmericanFurniture();
			
			Chair c = af.createChair();
			Sofa s = af.createSofa();
			
			
			
		}
		
//		if(input == "Italian") {
//			new ItalianFurniture();
//		}
		
		

	}

}

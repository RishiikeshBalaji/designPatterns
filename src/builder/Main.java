package builder;

import java.util.Scanner;

class Main {
	
	public static void main(String[] args) {
		System.out.println("Hello world");

		HouseBuilder houseBuilder = new HouseBuilder();
		houseBuilder.setNo_of_rooms(5);
		houseBuilder.setWindows(10);
		houseBuilder.setDoors(5);
		houseBuilder.setPaint("Red");
		houseBuilder.setHasSwimmingPool(true);
		houseBuilder.setHasGarden(true);
		houseBuilder.setHasStatues(true);

		House house = houseBuilder.houseBuild();
		System.out.println(house);
	}

	
	
	
	
	
	
	
	
	
	
	
}

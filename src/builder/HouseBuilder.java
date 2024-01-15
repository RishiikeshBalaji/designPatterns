package builder;

public class HouseBuilder {
	
	int no_of_rooms,windows,doors;
	String paint;
	Boolean hasSwimmingPool,hasGarden,hasStatues;
	
	
	
	public void setNo_of_rooms(int no_of_rooms) {
		this.no_of_rooms = no_of_rooms;
	}



	public void setWindows(int windows) {
		this.windows = windows;
	}



	public void setDoors(int doors) {
		this.doors = doors;
	}



	public void setPaint(String paint) {
		this.paint = paint;
	}



	public void setHasSwimmingPool(Boolean hasSwimmingPool) {
		this.hasSwimmingPool = hasSwimmingPool;
	}



	public void setHasGarden(Boolean hasGarden) {
		this.hasGarden = hasGarden;
	}



	public void setHasStatues(Boolean hasStatues) {
		this.hasStatues = hasStatues;
	}



	public House houseBuild() {
		return new House(no_of_rooms,windows,doors,paint,hasSwimmingPool,hasGarden,hasStatues);
	}
	
	
	

}

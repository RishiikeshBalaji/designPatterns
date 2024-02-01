package creationalPatterns.builder;

public class HouseBuilder {
	
	int windows,doors;
	String paint;
	Boolean hasSwimmingPool,hasGarden,hasStatues;
	Room r;

	public void set_room(Room r) {
		this.r = r;
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
		return new House(r,windows,doors,paint,hasSwimmingPool,hasGarden,hasStatues);
	}
	

}

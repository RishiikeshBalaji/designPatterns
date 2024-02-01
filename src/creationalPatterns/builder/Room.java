package creationalPatterns.builder;

public class Room {

    int no_of_fans;

    public Room() {
    }

    public Room(int no_of_fans) {
        this.no_of_fans = no_of_fans;
    }

    public void setNo_of_fans(int no_of_fans) {
        this.no_of_fans = no_of_fans;
    }

    public void get_info_of_room() {
        System.out.println("inside the room ");
    }

}

package creationalPatterns.singleton;

public class Main {

    public static void main(String[] args) {
            
            Database db = Database.getInstance();
            System.out.println(db.hashCode());

            System.out.println("Creating second object");

            Database db2 = Database.getInstance();
            System.out.println(db2.hashCode());
    }

}

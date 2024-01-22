package creationalPatterns.singleton;

public class Database {

    private static Database db;
    String name;
    int pw;

    private Database() {

        

        this.name = "Rishi";
        this.pw = 1786;
    }

    public static Database getInstance(){

        if(db == null){
            db = new Database();
        }
        return db;
    }
}

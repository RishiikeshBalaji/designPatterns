package behavioral.strategy;

public class Main {

    public static void main(String[] args) {
        Hatchback h = new Hatchback();
        h.accelaterate();
        h.brake();

        Sedan s = new Sedan();
        s.accelaterate();
        s.brake();


        Xuv x = new Xuv();
        x.accelaterate();
        x.brake();

        Muv m = new Muv();
        m.accelaterate();
        m.brake();

    }
}

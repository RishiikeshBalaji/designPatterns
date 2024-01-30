package behavioral.observer;

public class Main {

    public static void main(String[] args) {


        int token = 0;

        User u1 = new User();
        u1.setUserId(1);

        User u2 = new User();
        u2.setUserId(2);

        u1.stream(token);
        u2.stream(token);

        token = 1;
        
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        u1.stream(token);
        u2.stream(token);
    }
}

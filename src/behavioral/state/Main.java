package behavioral.state;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Context context = new Context();

        for(int i=1;i<=3;i++) {
            char c = scanner.next().charAt(0);
            context.process(c);

            if (context.isRejected()) {
                System.out.println("Invalid character entered. String rejected.");
                break;
            }
        }

        

        if (context.isAccepted()) {
            System.out.println("String accepted");
        }
    }
}

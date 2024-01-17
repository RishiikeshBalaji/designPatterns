package structuralPatterns.facade;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the code");

    String code;
    code = sc.next();

    IdeFacade i = new IdeFacade();

    i.run_button(code);

    sc.close();
    }
    
}

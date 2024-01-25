package behavioral.command;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            
            House l = new House("living","kitchen");
            RemoteCommand r = new RemoteCommand(l);
    
            while(true){
                System.out.println("Enter the button");
                Scanner sc = new Scanner(System.in);
                String code;
                code = sc.next();
                if(code.equals("1")){
                    r.button1();
                }
                else if(code.equals("2")){
                    r.button2();
                }
                else if(code.equals("3")){
                    r.button3();
                }
                else if(code.equals("4")){
                    r.button4();
                }
                else if(code.equals("exit")){
                    break;
                }
                else{
                    System.out.println("Invalid code");
                }

                sc.close();
            }
    }

}

package structuralPatterns.proxy;

public class Upi implements Transaction {

    private Service s;

    public Upi() {
        this.s = new Service();
    }

    public void deposit() {
        System.out.println("UPI: Depositing money");
        this.s.deposit();
        System.out.println("UPI: Money deposited");
    }

    public void withdraw() {
        System.out.println("UPI: Withdrawing money");
        this.s.withdraw();
        System.out.println("UPI: Money withdrawn");
    }


}

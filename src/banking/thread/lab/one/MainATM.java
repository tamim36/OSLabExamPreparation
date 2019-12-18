package banking.thread.lab.one;

public class MainATM {
    public static void main(String[] args) {
        Banking bank = new Banking();

        CustomerThread c1 = new CustomerThread(bank, 500);
        CustomerThread c2 = new CustomerThread(bank, 1000);
        CustomerThread c3 = new CustomerThread(bank,1500);
        CustomerThread c4 = new CustomerThread(bank, 2000);

        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }
}

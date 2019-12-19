package thread.waitnotifytwo.example;

public class ThreadSecond extends Thread {
    Customer c2 = new Customer();

    @Override
    public void run() {
        c2.deposit(1000);
    }
}

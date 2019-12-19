package thread.waitnotifytwo.example;

public class Customer {
    int amount = 1000;

    public synchronized void withdraw(int amount){
        if (this.amount < amount){
            System.out.println("Less balance .... Wait for deposit!");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("wait release");
        }
        this.amount -= amount;
        System.out.println("withdraw successful");
    }

    public synchronized void deposit(int amount){
        this.amount += amount;
        System.out.println("Deposit complete");
        notify();
        System.out.println("notify done !");
    }
}

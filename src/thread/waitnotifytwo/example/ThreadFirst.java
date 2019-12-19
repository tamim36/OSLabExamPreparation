package thread.waitnotifytwo.example;

public class ThreadFirst extends Thread {
    Customer c1 = new Customer();

    @Override
    public void run() {
        if (getName() == "first"){
            c1.withdraw(1500);
        }
        else if (getName() == "second"){
            c1.deposit(1000);
        }
    }

}

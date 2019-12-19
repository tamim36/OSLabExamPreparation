package thread.waitnotify.example;

public class Test {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        System.out.println("Main thread start");
        new Thread(){
            @Override
            public void run() {
                System.out.println("c1 thread withdraw start");
                c1.withdraw(1500);
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                c1.deposit(1000);
            }
        }.start();
    }
}

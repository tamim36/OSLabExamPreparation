package thread.waitnotifythree.example;

public class MainThread {
    public static void main(String[] args) {
        myAnotherThread t1 = new myAnotherThread();
        myThread t2 = new myThread();

        t2.start();
        t1.start();
    }
}

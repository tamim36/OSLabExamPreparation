package thread.synctwo.java;

public class TestProject extends Thread {
    private static final Object lock = new Object();
    public void run() {
        // synchronized (this)             this doesn't work
        synchronized (lock)
        {
            for (int i = 0; i < 1000; i++) {
                System.out.print(getName());
            }
        }
    }
}

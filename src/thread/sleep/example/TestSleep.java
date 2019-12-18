package thread.sleep.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestSleep extends Thread {
    Thread t;
    String name;
    TestSleep(String threadname){
        name = threadname;
        t = new Thread(this, name);
        t.start();
    }
    public void run() {
        synchronized (this) {
            ;
            for (int i = 1; i < 20; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Logger.getLogger(TestSleep.class.getName()).log(Level.SEVERE, null, e);
                }
                System.out.println(name + ": " + i);
            }
        }
    }
}

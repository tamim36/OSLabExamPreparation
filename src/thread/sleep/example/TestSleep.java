package thread.sleep.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestSleep extends Thread {

    public void run() {
        //synchronized (this)
        {
            ;
            for (int i = 1; i < 5; i++) {
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    Logger.getLogger(TestSleep.class.getName()).log(Level.SEVERE, null, e);
                }
                System.out.println(getName() + " : " + i);
            }
        }
    }
}

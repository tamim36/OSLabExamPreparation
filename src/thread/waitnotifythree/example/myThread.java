package thread.waitnotifythree.example;

public class myThread extends Thread{
    @Override
    public void run() {
        while(true){
            threadCondWait();// Circle waiting...
            //bla bla bla bla
        }
    }

    public synchronized void threadCondWait(){
        for (int i=0;i<5;i++){
            try {
                wait();//Comminucate with notify()
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
package thread.syncthree.example;

public class CallMe {
    public synchronized void call(String msg){
        System.out.println("Starting : " +msg);
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("End");
    }
}

package thread.syncthree.example;

public class MainToCall {
    public static void main(String[] args) {
        CallMe callMe = new CallMe();

        CallThread t1 = new CallThread(callMe, "Shimul");
        CallThread t2 = new CallThread(callMe, "dhojo");
        CallThread t3 = new CallThread(callMe, "emmaphore");

        //t1.start();
        //t2.start();

//        try {
//            t2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        //t3.start();



        System.out.println("Main");

    }
}

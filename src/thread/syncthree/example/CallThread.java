package thread.syncthree.example;

public class CallThread extends Thread {
    CallMe callMe;
    String msg;

    public CallThread(CallMe callMe, String msg) {
        this.callMe = callMe;
        this.msg = msg;
        start();
    }

    @Override
    public void run() {
        callMe.call(msg);
    }
}

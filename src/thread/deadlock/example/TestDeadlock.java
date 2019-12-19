package thread.deadlock.example;

public class TestDeadlock {
    public static void main(String[] args) {
        final String resource1 = "abcd";
        final String resource2 = "EFGH";

        Thread t1 = new Thread(){
            @Override
            public void run() {
                synchronized (resource1){
                    System.out.println("thread one execute resource1 " + resource1);
                    try {
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        System.out.println(e);
                    }
                    synchronized (resource2){
                        System.out.println("thread one execute resource2 " + resource2);
                        try {
                            Thread.sleep(100);
                        }catch (InterruptedException e){
                            System.out.println(e);
                        }
                    }
                }

            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                synchronized (resource2){
                    System.out.println("thread two execute resource2 " + resource2);
                    try {
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        System.out.println(e);
                    }
                    synchronized (resource1){
                        System.out.println("thread two execute resource1 " + resource1);
                        try {
                            Thread.sleep(100);
                        }catch (InterruptedException e){
                            System.out.println(e);
                        }
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}

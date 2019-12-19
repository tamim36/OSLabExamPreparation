package thread.sleep.example;

public class MainSleep {
    public static void main(String[] args) {
        TestSleep t1 = new TestSleep();
        TestSleep t2 = new TestSleep();
        TestSleep t3 = new TestSleep();

        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(t3.getName());

        t1.start();
        t2.start();
        t3.start();

    }
}

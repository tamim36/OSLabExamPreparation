package thread.sleep.example;

public class MainSleep {
    public static void main(String[] args) {
        TestSleep t1 = new TestSleep("Thread 1");
        TestSleep t2 = new TestSleep("Thread 2");
        TestSleep t3 = new TestSleep("Thread 3");

        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(t3.getName());



    }
}

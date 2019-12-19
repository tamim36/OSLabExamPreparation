package thread.waitnotifytwo.example;

public class MainTest {
    public static void main(String[] args) {
        ThreadFirst t1 = new ThreadFirst();
        ThreadSecond t2 = new ThreadSecond();

        t1.setName("first");
        t2.setName("second");

        t1.start();
        t2.start();
    }
}

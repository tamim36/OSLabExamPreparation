package thread.synctwo.java;

public class MainTest {
    public static void main(String[] args) throws InterruptedException {
        TestProject myProject = new TestProject();
        TestProject myProject1 = new TestProject();
        myProject.setName("1");
        myProject1.setName("2");
        myProject.start();
        myProject1.start();
    }
}

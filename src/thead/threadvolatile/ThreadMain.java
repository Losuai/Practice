package thead.threadvolatile;

public class ThreadMain {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        threadA.run();
        ThreadA threadA1 = new ThreadA();
        threadA1.stop();
        threadA1.run();
    }
}

package thead.threadlocal;

public class ThreadC implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.print(i);
        }
    }
}

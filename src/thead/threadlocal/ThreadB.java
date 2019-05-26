package thead.threadlocal;

public class ThreadB implements Runnable {
    String B;

    public ThreadB(String b) {
        B = b;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.print(B);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

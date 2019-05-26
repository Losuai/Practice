package thead.threadlocal;

public class ThreadA implements Runnable {
    String A;

    public ThreadA(String a) {
        A = a;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.print(A);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

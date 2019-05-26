package thead.threadlocal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadMain {
    public static void main(String[] args) {
        Thread threadA = new Thread(new ThreadA("A"));
        Thread threadB = new Thread(new ThreadB("B"));
        Thread threadC = new Thread(new ThreadC());
//        threadB.setPriority(10);
//        threadA.start();
//        threadB.start();
//        threadC.start();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(threadA);
        System.out.println(threadA.getId());
        executorService.execute(threadB);
        System.out.println(threadB.getId());
        executorService.execute(threadC);
        System.out.println(threadC.getId());
        executorService.shutdown();

    }
}

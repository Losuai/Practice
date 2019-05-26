package thead.threadlocal;

public class demo1 {
    ThreadLocal<String> stringThreadLocal = new ThreadLocal<>();
    ThreadLocal<Long> longThreadLocal = new ThreadLocal<>();

    public ThreadLocal<Long> getLongThreadLocal() {
        return longThreadLocal;
    }

    public ThreadLocal<String> getStringThreadLocal() {
        return stringThreadLocal;
    }

    public void set(){
        stringThreadLocal.set(Thread.currentThread().getName());
        longThreadLocal.set(Thread.currentThread().getId());
    }

    public static void main(String[] args) {
        demo1 demo1 = new demo1();
        demo1.set();
        System.out.println(demo1.getStringThreadLocal().get());
        System.out.println(demo1.getLongThreadLocal().get());
        Thread thread = new Thread(){
            @Override
            public void run() {
                demo1.set();
                System.out.println(demo1.getStringThreadLocal().get());
                System.out.println(demo1.getLongThreadLocal().get());
            }
        };
        thread.start();
    }
}

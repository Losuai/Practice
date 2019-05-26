package thead.threadvolatile;

public class ThreadA implements Runnable {
    private volatile boolean access = true;
    @Override
    public void run() {
        if (access){
            System.out.println("right!!!");
        }else {
            System.out.println("wrong!!!");
        }
    }
    public void stop(){
        access = false;
        System.out.println("stop!!!");
    }
}

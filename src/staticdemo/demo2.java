package staticdemo;

public class demo2 {
    public demo2() {
        System.out.println("构造器加载！！！");
    }

    public static String name = "LJL";
    static {
        System.out.println("静态代码块！！！");
    }
    public static void say(){
        System.out.println("Hello!!");
    }
    public static class Write{
        public void write(){
            System.out.println("静态内部类");
        }
        public static void say(){
            System.out.println("静态内部类静态方法");
        }
    }
}

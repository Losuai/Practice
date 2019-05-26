package staticdemo;

public class demo1 {
    public static void main(String[] args) {
        demo2.say();
        System.out.println(demo2.name);
        demo2 demo = new demo2();
        demo2.Write d = new demo2.Write();
        d.write();
        demo2.Write.say();
        demo.say();
        d.say();
    }
}

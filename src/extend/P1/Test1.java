package extend.P1;

import extend.P2.Son2;

public class Test1 {
    public static void main(String[] args) {
        Son1 son1 = new Son1();
        son1.f();
//        son1.clone();//clone可见性是java.lang包及其所有子类

        Son2 son2 = new Son2();
        son2.f();
//        son2.clone();
    }
}

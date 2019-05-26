package extend.P2;

import extend.P1.Father;

public class Son2 extends Father {

    public static void main(String[] args) {
        Son2 son2 = new Son2();
        son2.f();
        try {
            son2.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        Father father = new Father();
//        father.f();
    }
}

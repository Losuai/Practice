package extend.P1;

import extend.P2.Son2;

public class Father {
    protected  void f(){}

    public static void main(String[] args) {
        Son2 son2 = new Son2();
        try {
            son2.clone();//
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

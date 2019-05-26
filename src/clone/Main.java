package clone;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Father father = new Father();
        father.name = "ljl";
        father.age = 5;
        father.child = new Child();
        father.child.name ="loo";
        father.child.age = 2;
        Father father1 = (Father) father.clone();
        System.out.println("father == father1:" + (father == father1));
        System.out.println("father.name:"+father.name);
        System.out.println("father1.name:"+father1.name);
        System.out.println(father.hashCode());
        System.out.println(father1.hashCode());
        System.out.println(father.child == father1.child);
    }
}

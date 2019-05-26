package clone;

public class Father implements Cloneable {
    public String name;
    public int age;
    public Child child;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();//浅拷贝
//        Father father = (Father) super.clone();
//        father.child = (Child) this.child.clone();//深拷贝
//        return father;
    }
}

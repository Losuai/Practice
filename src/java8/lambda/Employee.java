package java8.lambda;

public class Employee {
    private int num;
    private String name;
    private int age;

    public Employee(int num, String name,int age) {
        this.age = age;
        this.name = name;
        this.num = num;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}

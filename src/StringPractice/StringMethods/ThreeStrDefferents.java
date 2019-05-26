package StringPractice.StringMethods;

public class ThreeStrDefferents {
    public static void main(String[] args) {
        String a = "abc";
        StringBuffer b = new StringBuffer("abc");
        StringBuilder c = new StringBuilder("abc");
        System.out.println(a == b.toString());
        System.out.println(a == c.toString());
        System.out.println(b.toString() == c.toString());
    }
}

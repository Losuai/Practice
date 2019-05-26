package StringPractice.StringMethods;

public class StringIntern {
    public static void main(String[] args) {
        String a = new String("ab");
        String b = new String("ab");
        String c = "ab";
        String d = "a" +  "b";
        System.out.println("a.equals(b): " + a.equals(b));
        System.out.println("a == b: " + a == b);
        System.out.println("a.equals(c): " + a.equals(c));
        System.out.println("a == c: " + a == c);
        System.out.println("a == d: " + a == d);
        System.out.println("c == d: " + c == d);
        System.out.println("a.equals(d): " + a.equals(d));
        System.out.println("c.equals(d): " + c.equals(d));
    }
}

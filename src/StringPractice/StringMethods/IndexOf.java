package StringPractice.StringMethods;

public class IndexOf {
    public static void main(String[] args) {
        String str = "adsfoe1b23sbabdf";
        System.out.println(str.indexOf("d"));
        System.out.println(str.indexOf(99));
        System.out.println(str.indexOf("s",2));
        System.out.println(str.indexOf(97, 2));
    }
}

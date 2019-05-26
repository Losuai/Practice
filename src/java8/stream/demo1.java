package java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class demo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("asdf");
        list.add("hgwr");
        list.add("adqw");
        list.add("qwdf");
        list.add("vfdv");
        list.stream()
                .sorted()
                .filter(l -> l.startsWith("a"))
                .map(String ::toUpperCase)
                .forEach(System.out :: println);
        IntStream.of(1,2).filter(c->c>1).forEach(System.out :: println);
        list.stream().collect(Collectors.joining(""));
    }
}

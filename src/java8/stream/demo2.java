package java8.stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class demo2 {
    public static void main(String[] args) {
//        String str = "1";
//        Optional<String> stropt = Optional.of(str);
//        String str1 = stropt.orElse("Hello");
//        System.out.println(str1);
//        stropt.ifPresent(System.out :: println);
        List<Integer> num1 = Arrays.asList(2,3,4,5);
        List<Integer> num2 = Arrays.asList(4,5);
        List<int[]> num3 = num1.stream().flatMap(i -> num2.stream()
                .filter(j-> (i+j)%3 == 0)
                .map(j-> new int[]{i,j})).collect(Collectors.toList());
        Integer num4 = num1.stream().reduce(0,(a,b)-> a+b);

        List<Integer> list = num1.stream().filter(i -> !i.equals(1)).collect(Collectors.toList());
        System.out.println(list.size());
        List<Integer> list1 = num1.stream().filter(i -> i.equals(1)).distinct().collect(Collectors.toList());
        System.out.println(list1.size());
        String s = "dsaffasdaf";
        System.out.println(s.substring(1));
    }
}

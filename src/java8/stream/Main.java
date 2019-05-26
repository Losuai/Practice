package java8.stream;


import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toCollection;

public class Main {

    public static void main(String[] args) {
        student student1 = new student(1, 2);
        student student2 = new student(2,3);
        student student3 = new student(3, 4);
        List<student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);
        students = students.stream().distinct().collect(Collectors.toList());
//        students = students.stream().collect(Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(student::getId))), ArrayList::new));
        students.size();
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println(currentTime);
        System.out.println(currentTime.getYear());
        System.out.println(currentTime.getMonthValue());
        System.out.println(currentTime.getDayOfMonth());
        System.out.println(students.stream().max(Comparator.comparing(student::getVersion)).get().getId());
        List<Integer> ids = students.stream().map(student -> student.getId()).collect(Collectors.toList());
//        Arrays.asList(ids).stream().collect(Collectors.joining(","));
    }
}

package java8.lambda;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        //无参数，无返回值
        Runnable r = () -> System.out.println("无参数，无返回值");
        r.run();
        System.out.println("----------------------------------");
        //有一个参数，并且无返回值,Consumer<T>接口接受一个T类型的参数，无返回值,消费型接口 （无返回值，需要传参数，只进不出）
        Consumer<String> stringConsumer = (x) -> System.out.println("有一个参数，并且无返回值." + x);
        stringConsumer.accept("hello");
        Consumer<Integer> stringConsumer1 = x -> System.out.println("一个参数可以省略括号." + x);
        stringConsumer1.accept(1);
        System.out.println("----------------------------------");
        //有两个以上的参数，有返回值，并且Lambda体中有多条语句,必须有大括号{},可省略两个参数的数据类型，JVM可根据上下文进行“类型判断”
        Comparator<Integer> integerComparator = (x, y) -> {
            System.out.println("两个参数");
            return  Integer.compare(x, y);
        };
        Comparator<Integer> integerComparator1 = (x, y ) -> Integer.compare(x, y);
        integerComparator.compare(1,4);
        System.out.println("----------------------------------");
        //函数式接口
        Integer num = operation(100, x -> x*x);
        System.out.println(num);
        System.out.println("----------------------------------");
        //排序
        List<Employee> emps = Arrays.asList(
                new Employee(101, "张三", 18),
                new Employee(102, "李四", 59),
                new Employee(103, "王五", 28),
                new Employee(104, "赵六", 18),
                new Employee(105, "田七", 38)
        );
        Collections.sort(emps, (e1, e2) ->{
            if(e1.getAge() == e2.getAge()){
                return e1.getName().compareTo(e2.getName());
            }else{
                return -Integer.compare(e1.getAge(), e2.getAge());
            }
        });
        for (Employee emp : emps) {
            System.out.println(emp.getName() + emp.getAge());
        }
        System.out.println("----------------------------------");
        //Supplier<T> : 供给型接口（有返回值，无入参）
        List<Integer> nums = getNumList(10, () -> (int) (Math.random() * 10));
        for (Integer i: nums) {
            System.out.println(i);
        }
        System.out.println("----------------------------------");
        //Function<T, R> : 函数型接口  传进去T, 返回R
        Integer strLength = handle("nuifsn", x -> x.substring(2).length());
        System.out.println(strLength);
        System.out.println("----------------------------------");
        //Predicate<T> : 断言型接口（做一个判断，符合条件的返回true）
        List<Integer> integerList = Arrays.asList(14,24,43,52,544,23,42,32,532,54,23,5,324,51,445,623,23,556,6347,6);
        List<Integer> handleList = filterInt(integerList, x -> x > 500 && x < 600);
        for (Integer i: handleList) {
            System.out.println(i);
        }

    }

    public static Integer operation(Integer num, MyFun fun){
        return fun.getValue(num);
    }
    public static List<Integer> getNumList(int num, Supplier<Integer> supplier){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i++){
            list.add(supplier.get());
        }
        return list;
    }
    public static Integer handle(String str, Function<String, Integer> function){
           return function.apply(str);
    }
    public static List<Integer> filterInt(List<Integer> list, Predicate<Integer> predicate){
        List<Integer> list1 = new ArrayList<>();
        for(Integer i : list){
            if (predicate.test(i)){
                list1.add(i);
            }
        }
        return list1;
    }
}

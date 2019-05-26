package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainA {
    /**
     * 引用传递和值传递
     * @param args
     */
    public static void main(String[] args) {
        List<List<String>> fatherList = new LinkedList<>();
        List<String> childList = new ArrayList<>();
        childList.add("before add");
        System.out.println(fatherList);
        fatherList.add(childList);
        System.out.println(fatherList);
        childList.add("after add");//对引用对象进行操作会同时改变原对象
        System.out.println(fatherList);//fatherList中元素变为两条

        int i = 4;
        int j = i;
        System.out.println(i);
        System.out.println(j);
        j = j + 1;
        System.out.println(i);
        System.out.println(j);
    }
}

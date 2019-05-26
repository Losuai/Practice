package collection.list;

import java.util.*;

public class Main {
    /**
     * 快速失败和安全失败
     * @param args
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("q");
        list.add("d");
        list.add("v");
        ListIterator<String> listIterator = list.listIterator();
        Iterator<String> iterable = list.iterator();
//        System.out.println(listIterator.next());
//        System.out.println(listIterator.next());
//        System.out.println(listIterator.previous());
//        System.out.println(listIterator.previous());
        while (listIterator.hasNext()){
            System.out.println("当前：" + listIterator.next());
            list.add("dd");
//            listIterator.add("dsa");
        }
        Thread threadA = new Thread(){
            @Override
            public void run() {
                list.add("dsfa");
            }
        };
        Thread threadB = new Thread(){
            @Override
            public void run() {
                iterable.hasNext();
            }
        };
//        threadA.run();
        threadB.run();
        HashMap hashMap = new HashMap();
        hashMap.put("不只Java-1", 1);
        hashMap.put("不只Java-2", 2);
        hashMap.put("不只Java-3", 3);

        Set set = hashMap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            hashMap.put("下次循环会抛异常", 4);
            System.out.println("此时 hashMap 长度为" + hashMap.size());
        }
    }

}

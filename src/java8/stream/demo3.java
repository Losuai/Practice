package java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class demo3 {
    public static void main(String[] args) {
        String[] str = {"hello", "world"};
        List<String> list = new ArrayList<>();
        list.add("rqdwwfc");
        list.add("dadgswevd");
        list.stream().map(i -> i.split("")).map(Arrays::stream).distinct().collect(Collectors.toList());
//        collect.stream().map(Arrays :: stream).distinct().collect(Collectors.toList());
//        collect.stream().flatMap(Arrays ::stream).distinct().collect(Collectors.toList());
        list.stream().map(i->i.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());

        int[] ints = {-1,0,1,2,-1,-4};
        System.out.println(ints[1]);
//        Stream<int[]> objectStream = Arrays.stream(ints).boxed().flatMap(a -> Arrays.stream(ints).flatMap(b ->
//                Arrays.stream(ints).filter(c -> a + b + c == 0).mapToObj(c -> new int[]{a, b, c})));
        findNum(ints);
        threeSum(ints);
        System.out.println(1);
    }
    public static List<List<Integer>> findNum(int[] ints){
        int length = ints.length;
        List<List<Integer>> result = new ArrayList<>();
        if (length < 3) {
            return null;
        }
        for (int i=0; i < length-1; i++){
            int l = length-1;
            if (i+1 >= l) continue;
            int a = ints[i];
            int b = ints[i+1];
            while (i+1 < l) {
                int c = ints[l];
                if (a + b + c == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(a);
                    list.add(b);
                    list.add(c);
                    result.add(list);
                }
                l--;
            }
        }
        return result;
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int lo = i + 1;
            int hi = nums.length - 1;
            while (lo < hi) {
                if ((nums[i] + nums[lo] + nums[hi]) == 0) {
                    result.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                    while (lo + 1 <= hi && nums[lo + 1] == nums[lo]) {
                        lo++;
                    }
                    while (hi - 1 >= lo && nums[hi - 1] == nums[hi]) {
                        hi--;
                    }
                    lo++;
                    hi--;
                } else if ((nums[i] + nums[lo] + nums[hi]) > 0) {
                    hi--;
                } else {
                    lo++;
                }
            }
        }
        return result;
    }

}

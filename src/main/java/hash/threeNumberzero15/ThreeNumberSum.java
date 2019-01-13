package hash.threeNumberzero15;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {
    public List<List<Integer>> threeSum(int[] nums) {
        int[] ints = Arrays.stream(nums).distinct().sorted().toArray();

        List<List<Integer>> l = new ArrayList<>();
        for (int i = 0; i < ints.length; i++) {
            for (int j = i; j < ints.length - i; j++) {

                for (int k = j; k < ints.length - j; k++) {
                    if (i != k && k != j) {

                        List<Integer> list = new ArrayList<>();
                        list.add(ints[i]);
                        list.add(ints[j]);
                        list.add(ints[k]);

                        l.add(list);
                    }

                }
            }
        }

        return l;
    }
}

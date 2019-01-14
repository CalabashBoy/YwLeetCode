package hash.threeNumberzero15;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {
   public static List<List<Integer>> threeSum(int[] nums)
    {
        List<List<Integer>> all = new ArrayList<>();
        Set set = new HashSet();
        for (int i : nums)
        {
            set.add(i);
        }

        for (int i = 0; i < nums.length; i++)
        {
            for (int j = i + 1; j < nums.length; j++)
            {
                int sum = nums[i] + nums[j];
                if (set.contains(-sum))
                {

                    List list = new ArrayList();
                    list.add(-sum);
                    list.add(nums[i]);
                    list.add(nums[j]);
                    all.add(list);
                    set.removeAll(list);
                }
            }
        }
        return all;
    }
    
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

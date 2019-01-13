package hash.onceNum136;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class OnceNumber {
    public int singleNumber(int[] nums) {
        Set set = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.remove(nums[i]);
            }
        }

        return (Integer) set.iterator().next();
    }

    public int singleNumber2(int[] nums) {
        Arrays.sort(nums);
        boolean flag = true;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (flag) {
                sum += nums[i];
            } else {
                sum -= nums[i];
            }
            flag = !flag;
        }

        return sum;
    }

    public int singleNumber3(int[] nums) {

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum^=nums[i];
        }

        return sum;
    }
}

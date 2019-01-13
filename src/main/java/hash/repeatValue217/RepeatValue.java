package hash.repeatValue217;

import java.util.HashSet;
import java.util.Set;

public class RepeatValue {
    public boolean containsDuplicate(int[] nums) {
        Set set = new HashSet();

        for (int i = 0; i < nums.length;i++){
            if (set.contains(nums[i]))
                return true;
            else{
                set.add(nums[i]);
            }
        }

        return false;
    }
}

package hash.NRepeatedIn2N961;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @auther: y00349114
 * @version: 1.0
 * @since:
 */
public class Solution
{
    //    Example 1:
    //
    //    Input: [1,2,3,3]
    //    Output: 3
    //    Example 2:
    //
    //    Input: [2,1,2,5,3,2]
    //    Output: 2
    //    Example 3:
    //
    //    Input: [5,1,5,2,5,3,5,4]
    //    Output: 5

    //    4 <= A.length <= 10000
    //        0 <= A[i] < 10000
    //    A.length is even
    public int repeatedNTimes(int[] A)
    {
        Map<Integer, Integer> map = new HashMap<>();
        int result = -1;
        for (int i : A)
        {
            if (map.containsKey(i))
            {
                Integer count = map.get(i);
                count++;
                map.put(i, count);

                if (count * 2 == A.length)
                {
                    result = i;
                }
            }
            else
            {
                map.put(i, 1);
            }
        }

        return result;
    }

    public int repeatedNTimes2(int[] A)
    {
        Arrays.sort(A);

        int l = A.length;
        int low = A[l/2 - 1];
        int high = A[l/2];

        return high==A[l/2+1]?high:low;
    }

    public int repeatedNTimes3(int[] A)
    {
        Map<Integer, Integer> map = new HashMap<>();
        int result = -1;
        for (int i : A)
        {
            if (map.containsKey(i))
            {
                return  i;
            }
            else
            {
                map.put(i, 1);
            }
        }

        throw null;
    }

    public static void main(String[] args)
    {
        int[] A = {1, 2, 3, 3};

        Solution solution = new Solution();
        solution.repeatedNTimes(A);
    }
}

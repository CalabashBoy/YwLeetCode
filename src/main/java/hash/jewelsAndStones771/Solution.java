package hash.jewelsAndStones771;

import java.util.HashSet;
import java.util.Set;

/**
 * @auther: y00349114
 * @version: 1.0
 * @since:
 */
public class Solution
{
    //    Input: J = "aA", S = "aAAbbbb"
    //    Output: 3

    //    Input: J = "z", S = "ZZ"
    //    Output: 0
    public int numJewelsInStones(String J, String S)
    {
        char[] charsJerwels = J.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char c : charsJerwels)
        {
            set.add(c);
        }

        char[] charStones = S.toCharArray();
        int count = 0;
        for (char c : charStones)
        {
            if (set.contains(c))
            {
                count++;
            }
        }

        return count;
    }
}

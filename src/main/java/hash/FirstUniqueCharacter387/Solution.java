package hash.FirstUniqueCharacter387;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @auther: y00349114
 * @version: 1.0
 * @since:
 */
public class Solution
{
    public int firstUniqChar(String s)
    {
        char[] chars = s.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for (char c : chars)
        {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++)
        {
            if (map.get(s.charAt(i)) == 1)
            {
                return i;
            }
        }

        return -1;
    }

    public static int firstUniqChar1(String s)
    {
        char[] index = new char[26];

        for (char c : s.toCharArray())
        {
            int i = c - 'a';
            index[i]++;
        }
        int count = 0;
        for (char c : s.toCharArray())
        {

            if (index[c-'a'] == 1)
                return count;
            else
                count++;
        }

        return -1;
    }

    public static void main(String[] args)
    {
        firstUniqChar1("loveleetcode");
    }
}

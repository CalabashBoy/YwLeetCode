package hash.UncommonWordsfromTwoSentences844;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @auther: y00349114
 * @version: 1.0
 * @since:
 */
public class Solution
{
    //o(A+b)    o(A+B)
    public static String[] uncommonFromSentences(String A, String B)
    {
        Map<String , Integer> count = new HashMap<>();
        for (String w : (A + " " +B).split(" "))
        {
            Integer orDefault = count.getOrDefault(w, 0);
            count.put(w, orDefault + 1);
        }

        ArrayList<String> strList = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : count.entrySet())
        {
            if (entry.getValue() == 1)
            {
                strList.add(entry.getKey());
            }
        }
        return strList.toArray(new String[0]);
    }

    public static String[] uncommonFromSentences2(String A, String B)
    {
        List<String> words = Arrays.asList((A + " " + B).split(" "));
        return words.stream().filter(w -> Collections.frequency(words, w) < 2).toArray(String[]::new);
    }

    public static void main(String[] args)
    {
        String A = "this apple is sweet";
        String B = "this apple is sour";
        String[] strings = uncommonFromSentences2(A, B);

    }
}


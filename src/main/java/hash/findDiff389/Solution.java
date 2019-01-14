package hash.findDiff389;

import java.util.HashSet;
import java.util.Set;

public class Solution {

  public char findTheDifference(String s, String t) {
    Set<Character> set = new HashSet<>();

    int sums = 0;
    for (char i : s.toCharArray()) {
      sums += i;
    }

    int sumt = 0;
    for (char i : t.toCharArray()) {
      if (!set.contains(i)) {
        sumt += i;
      }
    }

    return (char) (sumt - sums);
  }

  public char findTheDifference1(String s, String t) {
    String a = s + t;

    char k = 0;
    for (char i : a.toCharArray()) {
      k ^= i;
    }

    return k;
  }
}

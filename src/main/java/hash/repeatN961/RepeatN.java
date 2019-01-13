package hash.repeatN961;

import java.util.Arrays;

//在大小为 2N 的数组 A 中有 N+1 个不同的元素，其中有一个元素重复了 N 次。
//返回重复了 N 次的那个元素。
public class RepeatN {
    public int repeatedNTimes(int[] A) {
        int n = A[0];
        int[] count = new int[10000];

        for (int i : A) {
            count[i]++;
            if (count[i] == A.length / 2 + 1) {
                n = i;
                break;
            }
        }

        return n;
    }

    public int repeatedNTimes2(int[] A) {
        Arrays.sort(A);
        return A[A.length / 2] == A[A.length - 1] ? A[A.length - 1] : A[A.length / 2 - 1];
    }
}

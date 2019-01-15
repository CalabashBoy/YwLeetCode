package hash.countPrime204;

/**
 * @auther: y00349114
 * @version: 1.0
 * @since:
 */
public class CountPrime {
    public int countPrimes(int n) {
        int num = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                num++;
            }
        }

        return num;
    }

    private boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            int i1 = n % i;
            if (i1 == 0) {
                return false;
            }
        }

        return true;
    }

    public static int count(int n) {
        boolean[] mark = new boolean[n];

        for (int i = 2; i < n; i++) {
            mark[i] = true;
        }

        for (int i = 2; i * i< n; i++) {
            if (!mark[i] == true)
                continue;

            for (int j = i * i; j < n; j += i) {
                mark[j] = false;
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (mark[i])
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(count(10));
    }
}

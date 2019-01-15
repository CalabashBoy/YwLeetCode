package hash.countPrime204;

/**
 * @auther: y00349114
 * @version: 1.0
 * @since:
 */
public class Solution
{
    public int countPrimes(int n)
    {
        int num = 0;
        for (int i = 2; i < n; i++)
        {
            if (isPrime(i))
            {
                num++;
            }
        }

        return num;
    }

    private boolean isPrime(int n)
    {
        for (int i = 2; i * i <= n; i++)
        {
            int i1 = n % i;
            if (i1 == 0)
            {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args)
    {
        Solution solution = new Solution();
        System.out.println(solution.countPrimes(10));
    }
}

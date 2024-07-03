import java.util.Arrays;

public class SegmentedSieve {

    public static void main(String[] args) {
        int low = 10;
        int high = 50;
        
        boolean[] isPrime = segmentedSieve(low, high);
        
        System.out.println("Prime numbers between " + low + " and " + high + ":");
        for (int i = low; i <= high; i++) {
            if (isPrime[i - low] && i > 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static boolean[] segmentedSieve(int low, int high) {
        int limit = (int) Math.sqrt(high) + 1;
        boolean[] basePrimes = simpleSieve(limit);

        boolean[] isPrime = new boolean[high - low + 1];
        Arrays.fill(isPrime, true);

        for (int prime : basePrimes) {
            int start = Math.max(prime * prime, low + (prime - low % prime) % prime);
            for (int j = start; j <= high; j += prime) {
                isPrime[j - low] = false;
            }
        }

        return isPrime;
    }

    public static boolean[] simpleSieve(int limit) {
        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);

        for (int p = 2; p * p <= limit; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= limit; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        isPrime[0] = isPrime[1] = false; // 0 and 1 are not primes

        return isPrime;
    }
}


*****************************************************************
  /*
  Example to Illustrate:
  
Let's take an example with low = 10 and high = 20. Suppose basePrimes contains [2, 3, 5].

For prime = 2:

start = Math.max(2 * 2, 10 + (2 - 10 % 2) % 2)
start = Math.max(4, 10 + 0)
start = 10
We mark multiples of 2 as non-prime starting from 10 in steps of 2: isPrime[10 - 10] = false, isPrime[12 - 10] = false, isPrime[14 - 10] = false, isPrime[16 - 10] = false, isPrime[18 - 10] = false, isPrime[20 - 10] = false.
For prime = 3:

start = Math.max(3 * 3, 10 + (3 - 10 % 3) % 3)
start = Math.max(9, 10 + 2)
start = 10
We mark multiples of 3 as non-prime starting from 10 in steps of 3: isPrime[10 - 10] = false, isPrime[13 - 10] = false, isPrime[16 - 10] = false, isPrime[19 - 10] = false.
For prime = 5:

start = Math.max(5 * 5, 10 + (5 - 10 % 5) % 5)
start = Math.max(25, 10 + 0)
start = 25
We mark multiples of 5 as non-prime starting from 25, but since 25 is greater than 20, no multiples of 5 need to be marked within [10, 20].
  */

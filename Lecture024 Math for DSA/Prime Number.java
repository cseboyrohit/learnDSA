public class Main {

    public static void main(String[] args) {
        int n = 17; // Number to check for primality
        
        if (isPrime(n)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        
        // Check divisibility from 2 up to the square root of n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Found divisor, not prime
            }
        }
        
        return true; // No divisors found, prime
    }
}

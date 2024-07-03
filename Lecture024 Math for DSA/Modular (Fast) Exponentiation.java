/*
You are given a three integers 'X', 'N', and 'M'. Your task is to find ('X' ^ 'N') % 'M'. A ^ B is defined as A raised 
to power B and A % C is the remainder when A is divided by C.
Explanation for Sample Output 1:
In test case 1, 
X = 3, N = 1, and M = 2 
X ^ N = 3 ^ 1 = 3 
X ^ N % M = 3 % 2 = 1. 
So the answer will be 1.

In test case 2,
X = 4, N = 3, and M = 10 
X ^ N = 4 ^ 3 = 64 
X ^ N % M = 64 % 10 = 4. 
So the answer will be 4.

*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // number of test cases
        
        for (int t = 0; t < T; t++) {
            int X = scanner.nextInt();
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            
            long result = powerMod(X, N, M);
            System.out.println(result);
        }
        
        scanner.close();
    }
    
    // Function to calculate (base^exp) % mod using iterative method
    public static long powerMod(int base, int exp, int mod) {
        if (mod == 1) return 0; // handle mod = 1 case
        
        long result = 1; // Initialize result
        
        // Reduce base if it is greater than or equal to mod
        base = base % mod; 
        
        while (exp > 0) {
            // If exp is odd, multiply base with result
            if ((exp & 1) == 1) 
                result = (result * base) % mod;
            
            // exp must be even now
            exp = exp >> 1; // exp = exp / 2
            base = (base * base) % mod; // Change base to base^2
        }
        
        return result;
    }
}

/* *****************************************************************************
Step-by-Step Calculation:

Initialization:

base = 3, exp = 5, mod = 7
result = 1 (initial value)

Iterative Process:
First Iteration:

exp = 5 (odd), so update result:
result = (1 * 3) % 7 = 3

Update exp (right shift):
exp = 5 >> 1 = 2

Update base (square and modulo):
base = (3 * 3) % 7 = 9 % 7 = 2

* Second Iteration:

exp = 2 (even), so result remains the same:
result = 3

Update exp (right shift):
exp = 2 >> 1 = 1

Update base (square and modulo):
base = (2 * 2) % 7 = 4 % 7 = 4

** Third Iteration:
exp = 1 (odd), so update result:
result = (3 * 4) % 7 = 12 % 7 = 5

Update exp (right shift):
exp = 1 >> 1 = 0
Update base (square and modulo) - no change needed as exp is now 0.
  */

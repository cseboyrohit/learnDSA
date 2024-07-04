public class CatalanNumber {

    // Function to calculate the n-th Catalan number
    public static long catalan(int n) {
        if (n <= 1) {
            return 1;
        }
        
        // Create an array to store catalan numbers
        long[] catalan = new long[n + 1];
        
        // Initialize the first two values
        catalan[0] = 1;
        catalan[1] = 1;
        
        // Fill the catalan array in bottom-up manner
        for (int i = 2; i <= n; i++) {
            catalan[i] = 0;
            for (int j = 0; j < i; j++) {
                catalan[i] += catalan[j] * catalan[i - j - 1];
            }
        }
        
        // Return the n-th Catalan number
        return catalan[n];
    }

    public static void main(String[] args) {
        int n = 5; // Example: Calculate the 5th Catalan number
        System.out.println("The " + n + "th Catalan number is: " + catalan(n));
    }
}

/* ********************************************************
    The outer loop (for (int i = 2; i <= n; i++)) iterates from 2 to n, computing each Catalan number up to C_n.
** For each i, initializes catalan[i] to 0.

* The inner loop (for (int j = 0; j < i; j++)) computes catalan[i] by summing up products of previously computed Catalan numbers:

** catalan[j] * catalan[i - j - 1]. Here, j ranges from 0 to i - 1.

** This corresponds to the recursive formula for Catalan numbers: C_i = C_0 * C_{i-1} + C_1 * C_{i-2} + ... + C_{i-1} * C_0.

    */

/*
### Step-by-Step Explanation for `n = 5`:

1. **Initialization**:
   - Hum `n = 5` ke liye program chalayenge, jisse `catalan` array banega jiska size 6 hoga (0 se 5 tak).

   - **i = 1**: Pehla loop `i = 1` ke liye chalta hai. `catalan[1]` ko calculate karna hai.
     - Inner loop `j` 0 se lekar `j < 1` tak chalta hai (sirf ek baar).
     - `catalan[1] += catalan[0] * catalan[0];`
     - Yahan `catalan[0]` ki value 1 hai, toh `catalan[1] = 1 * 1 = 1;`

     Ab `catalan[1]` ki value ho gayi 1.

   - **i = 2**: Dusra loop `i = 2` ke liye chalta hai. `catalan[2]` ko calculate karna hai.
     - Inner loop `j` 0 se lekar `j < 2` tak chalta hai (do baar).
     - `catalan[2] += catalan[0] * catalan[1];`
     - `catalan[2] += catalan[1] * catalan[0];`
     - Yahan `catalan[0]` ki value 1 hai aur `catalan[1]` ki value bhi 1 hai, toh:
     - `catalan[2] = 1 * 1 + 1 * 1 = 2;`

     Ab `catalan[2]` ki value ho gayi 2.

   - **i = 3**: Tisra loop `i = 3` ke liye chalta hai. `catalan[3]` ko calculate karna hai.
     - Inner loop `j` 0 se lekar `j < 3` tak chalta hai (teen baar).
     - `catalan[3] += catalan[0] * catalan[2];`
     - `catalan[3] += catalan[1] * catalan[1];`
     - `catalan[3] += catalan[2] * catalan[0];`
     - Yahan `catalan[0]` ki value 1, `catalan[1]` ki value 1, aur `catalan[2]` ki value 2 hai, toh:
     - `catalan[3] = 1 * 2 + 1 * 1 + 2 * 1 = 5;`

     Ab `catalan[3]` ki value ho gayi 5.

   - **i = 4**: Chautha loop `i = 4` ke liye chalta hai. `catalan[4]` ko calculate karna hai.
     - Inner loop `j` 0 se lekar `j < 4` tak chalta hai (chaar baar).
     - `catalan[4] += catalan[0] * catalan[3];`
     - `catalan[4] += catalan[1] * catalan[2];`
     - `catalan[4] += catalan[2] * catalan[1];`
     - `catalan[4] += catalan[3] * catalan[0];`
     - Yahan `catalan[0]` ki value 1, `catalan[1]` ki value 1, `catalan[2]` ki value 2, aur `catalan[3]` ki value 5 hai, toh:
     - `catalan[4] = 1 * 5 + 1 * 2 + 2 * 1 + 5 * 1 = 14;`

     Ab `catalan[4]` ki value ho gayi 14.

   - **i = 5**: Paanchwa loop `i = 5` ke liye chalta hai. `catalan[5]` ko calculate karna hai.
     - Inner loop `j` 0 se lekar `j < 5` tak chalta hai (paanch baar).
     - `catalan[5] += catalan[0] * catalan[4];`
     - `catalan[5] += catalan[1] * catalan[3];`
     - `catalan[5] += catalan[2] * catalan[2];`
     - `catalan[5] += catalan[3] * catalan[1];`
     - `catalan[5] += catalan[4] * catalan[0];`
     - Yahan `catalan[0]` ki value 1, `catalan[1]` ki value 1, `catalan[2]` ki value 2, `catalan[3]` ki value 5, aur `catalan[4]` ki value 14 hai, toh:
     - `catalan[5] = 1 * 14 + 1 * 5 + 2 * 2 + 5 * 1 + 14 * 1 = 42;`

     Ab `catalan[5]` ki value ho gayi 42.

3. **Output**:
   - Jab `for` loops puri hote hain, `catalan[5]` mein 5th Catalan number ki value store ho jaati hai.
   - Is example mein, output kuch iss tarah hoga:

   ```
   Catalan[0] = 1
   Catalan[1] = 1
   Catalan[2] = 2
   Catalan[3] = 5
   Catalan[4] = 14
   Catalan[5] = 42
   ```

Yeh program `n = 5` ke liye dynamic programming approach se Catalan numbers ko calculate karta hai. Har iteration mein `catalan[i]` ko update karne se 
    pehle uski value previous calculations ke base par calculate ki jaati hai, jo ki efficiency aur performance ko improve karta hai.
    */

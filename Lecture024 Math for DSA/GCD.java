public class GCDExample {

    // Method to calculate GCD using Euclid's algorithm recursively
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int num1 = 36;
        int num2 = 24;
        
        // Calculate GCD of num1 and num2
        int result = gcd(num1, num2);
        
        // Output the result
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);
    }
}

public class LCMCalculator {

    // Function to calculate GCD of two numbers using Euclidean algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate LCM of two numbers
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 30;
        
        int result = lcm(num1, num2);
        
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + result);
    }
}


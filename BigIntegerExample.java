import java.math.BigInteger;

public class BigIntegerExample {
    public static void main(String[] args) {
        // Create two BigIntegers
        BigInteger num1 = new BigInteger("123456789012345678901234567890");
        BigInteger num2 = new BigInteger("987654321098765432109876543210");

        // Perform arithmetic operations
        BigInteger sum = num1.add(num2); // Addition
        BigInteger difference = num1.subtract(num2); // Subtraction
        BigInteger product = num1.multiply(num2); // Multiplication
        BigInteger quotient = num1.divide(num2); // Division (integer division)
        BigInteger remainder = num1.remainder(num2); // Remainder

        // Print results
        System.out.println("num1 + num2 = " + sum);
        System.out.println("num1 - num2 = " + difference);
        System.out.println("num1 * num2 = " + product);
        System.out.println("num1 / num2 = " + quotient);
        System.out.println("num1 % num2 = " + remainder);
    }
}


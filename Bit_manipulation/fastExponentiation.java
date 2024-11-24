package BitManipulation;

import java.math.BigInteger;

public class fastExponentiation {
    public static long exponentiation(long n, long y){
        long result=1;
        while(y>0){
            if((y&1)==1){
                result = result * n;
            }
            n=n*n;
            y=y>>1;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(exponentiation(2,10));
    }
}

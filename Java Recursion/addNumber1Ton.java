package Recursion;

public class addNumber {
    public static int addNum(int n){
        if(n==1){
            return 1;
        }

        return n + addNum(n-1);
    }

    public static void main(String[] args) {
        System.out.println(addNum(10));
    }
}

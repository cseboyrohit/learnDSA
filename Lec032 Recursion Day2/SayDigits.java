package CodeHelp;

import java.util.Scanner;

public class sayNumber {
    public static void sayNumber(int num , String[] arr) {
        if(num == 0)
            return;

        int mod = num % 10;
        int ans = num/10;
        sayNumber(ans, arr); // recursive relation
        System.out.println(arr[mod]);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] arr = {"Zero", "One", "Two", "Three", "Four",
                "Five", "Six", "Seven", "Eight",
                "Nine", "Ten"};

        sayNumber(n , arr);
    }
}

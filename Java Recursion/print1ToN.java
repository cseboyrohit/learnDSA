package Recursion;
public class print1ToN {
    public static void printNum(int num){
        if (num == 0)
            return;

        printNum(num - 1);
        System.out.print(num +" ");  //1 2 3 4 5
    }
    public static void main(String[] args) {
        printNum(5);

    }
}

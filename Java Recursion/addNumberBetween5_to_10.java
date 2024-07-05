package Recursion;

public class addNumberBetween5_to_10_ava {
    public static int addAllNum(int n1, int n2){
        if(n2 > n1) {
            return n2 + addAllNum(n1, n2 - 1);
        }else{
            return n2;
        }
    }

    public static void main(String[] args) {
        System.out.println(addAllNum(5,0));
    }
}

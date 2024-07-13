import java.util.Stack;

public class Main {
    
    public static void sortStack(Stack<Integer> s1) {
        Stack<Integer> s2 = new Stack<>();
        
        while (!s1.isEmpty()) {
            int tmp = s1.pop();
            
            // Move elements from s2 back to s1 where they are greater than tmp
            while (!s2.isEmpty() && s2.peek() > tmp) {
                s1.push(s2.pop());
            }
            
            // Push tmp onto s2
            s2.push(tmp);
        }
        
        // Move elements from s2 to s1 to get sorted order in s1
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(10);
        s1.push(5);
        s1.push(20);
        s1.push(2);
        
        sortStack(s1);
        
        // Print elements from s1 (sorted)
        while (!s1.isEmpty()) {
            System.out.println(s1.pop());
        }
    }
}

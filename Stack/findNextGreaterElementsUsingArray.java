import java.util.*;

class Main {
    
    public static int[] findNextGreaterElements(int[] arr) {
        int size = arr.length;
        int[] result = new int[size];
        Stack<Integer> s = new Stack<>();
        
        for (int i = size - 1; i >= 0; i--) {
            if (s.isEmpty()) {
                result[i] = -1;
            }
            else if (s.size() > 0 && s.peek() > arr[i]) {
                result[i] = s.peek();
            }
            else if (s.size() > 0 && s.peek() <= arr[i]) {
                while (s.size() > 0 && s.peek() <= arr[i]) {
                    s.pop();
                }
                if (s.isEmpty()) {
                    result[i] = -1;
                } else {
                    result[i] = s.peek();
                }
            }
            s.push(arr[i]); // push the element in the stack
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        int[] result = findNextGreaterElements(arr);
        
        System.out.println(Arrays.toString(result)); // Output: [5, 10, 10, -1, -1]
    }
}

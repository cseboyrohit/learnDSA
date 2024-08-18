import java.util.*;

class Main {
    
    public static List<Integer> findNextGreaterElements(int[] arr) {
        List<Integer> v = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        int size = arr.length;
        
        for (int i = size - 1; i >= 0; i--) {
            if (s.isEmpty()) {
                v.add(-1);
            }
            else if (s.size() > 0 && s.peek() > arr[i]) {
                v.add(s.peek());
            }
            else if (s.size() > 0 && s.peek() <= arr[i]) {
                while (s.size() > 0 && s.peek() <= arr[i]) {
                    s.pop();
                }
                if (s.isEmpty()) {
                    v.add(-1);
                } else {
                    v.add(s.peek());
                }
            }
            s.push(arr[i]); // push the element in the stack
        }
        
        // Reverse the list to restore original order
        Collections.reverse(v);
        
        return v;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        List<Integer> result = findNextGreaterElements(arr);
        
        System.out.println(result); // Output: [5, 10, 10, -1, -1]
    }
}

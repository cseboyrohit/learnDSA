
import java.util.*;

class Main {
    
    public static List<Integer> calculateSpan(int[] prices) {
        List<Integer> span = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int size = prices.length;
        
        for (int i = 0; i < size; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                span.add(i + 1);
            } else {
                span.add(i - stack.peek());
            }
            stack.push(i);
        }
        
        return span;
    }

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        List<Integer> result = calculateSpan(prices);
        
        System.out.println(result); // Output: [1, 1, 1, 2, 1, 4, 6]
    }
}

/* APRROACH 

  Sure, let's do a dry run of your code with the example array `{100, 80, 60, 70, 60, 75, 85}`.

### Initial Setup
- `prices = {100, 80, 60, 70, 60, 75, 85}`
- `span = []`
- `s = []`

### Iteration 1 (i = 0)
- Current price: `100`
- Stack is empty.
- Span for `100` is `0 + 1 = 1`.
- Push index `0` onto the stack.
- `span = [1]`
- `s = [0]`

### Iteration 2 (i = 1)
- Current price: `80`
- Stack is not empty, but `prices[s.peek()] = 100` is greater than `80`.
- Span for `80` is `1 - 0 = 1`.
- Push index `1` onto the stack.
- `span = [1, 1]`
- `s = [0, 1]`

### Iteration 3 (i = 2)
- Current price: `60`
- Stack is not empty, but `prices[s.peek()] = 80` is greater than `60`.
- Span for `60` is `2 - 1 = 1`.
- Push index `2` onto the stack.
- `span = [1, 1, 1]`
- `s = [0, 1, 2]`

### Iteration 4 (i = 3)
- Current price: `70`
- Stack is not empty, and `prices[s.peek()] = 60` is less than `70`, so pop `2`.
- Stack is not empty, but `prices[s.peek()] = 80` is greater than `70`.
- Span for `70` is `3 - 1 = 2`.
- Push index `3` onto the stack.
- `span = [1, 1, 1, 2]`
- `s = [0, 1, 3]`

### Iteration 5 (i = 4)
- Current price: `60`
- Stack is not empty, but `prices[s.peek()] = 70` is greater than `60`.
- Span for `60` is `4 - 3 = 1`.
- Push index `4` onto the stack.
- `span = [1, 1, 1, 2, 1]`
- `s = [0, 1, 3, 4]`

### Iteration 6 (i = 5)
- Current price: `75`
- Stack is not empty, and `prices[s.peek()] = 60` is less than `75`, so pop `4`.
- Stack is not empty, and `prices[s.peek()] = 70` is less than `75`, so pop `3`.
- Stack is not empty, but `prices[s.peek()] = 80` is greater than `75`.
- Span for `75` is `5 - 1 = 4`.
- Push index `5` onto the stack.
- `span = [1, 1, 1, 2, 1, 4]`
- `s = [0, 1, 5]`

### Iteration 7 (i = 6)
- Current price: `85`
- Stack is not empty, and `prices[s.peek()] = 75` is less than `85`, so pop `5`.
- Stack is not empty, and `prices[s.peek()] = 80` is less than `85`, so pop `1`.
- Stack is not empty, but `prices[s.peek()] = 100` is greater than `85`.
- Span for `85` is `6 - 0 = 6`.
- Push index `6` onto the stack.
- `span = [1, 1, 1, 2, 1, 4, 6]`
- `s = [0, 6]`

### Final Output
- `span = [1, 1, 1, 2, 1, 4, 6]`

This dry run confirms that your code correctly calculates the stock span for each price in the array. If you have any
  more questions or need further assistance, feel free to ask!
*/

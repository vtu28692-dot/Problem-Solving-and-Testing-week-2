import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> stack = new ArrayDeque<>();
        int popIndex = 0;
        
        for (int val : pushed) {
            stack.push(val);
            // Greedily pop matching elements
            while (!stack.isEmpty() && stack.peek() == popped[popIndex]) {
                stack.pop();
                popIndex++;
            }
        }
        
        // If all elements were successfully matched and popped, the stack will be empty
        return stack.isEmpty();
    }
}

import java.util.*;

class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        Stack<Long> stack = new Stack<>();

        for (int num : nums) {
            stack.push((long) num);

            while (stack.size() >= 2) {
                long top = stack.pop();
                long second = stack.pop();

                if (top == second) {
                    stack.push(top + second);
                } else {
                    stack.push(second);
                    stack.push(top);
                    break;
                }
            }
        }

        return new ArrayList<>(stack);
    }
}

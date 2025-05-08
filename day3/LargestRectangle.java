package day3;

import java.util.List;
import java.util.Stack;

public class LargestRectangle {
    public static long largestRectangle(List<Integer> h) {
        // Write your code here
        Stack<Integer> stack = new Stack<>();
        long maxArea = 0;
        int n = h.size();

        for (int i = 0; i <= n; i++) {
            int currentHeight = 0;
            if (i != n) {
                currentHeight = h.get(i);
            }
            while (!stack.isEmpty() && currentHeight < h.get(stack.peek())) {
                int height = h.get(stack.pop());
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                long area = (long) height * width;
                maxArea = Math.max(maxArea, area);
            }

            stack.push(i);
        }
        return maxArea;
    }
}

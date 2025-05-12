package day3;

import java.util.List;
import java.util.Stack;

public class EqualStacks {
    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        // Write your code here
        Stack<Integer> s1 = getSum(h1);
        Stack<Integer> s2 = getSum(h2);
        Stack<Integer> s3 = getSum(h3);

        while (!s1.isEmpty() && !s2.isEmpty() && !s3.isEmpty()) {
            int top1 = s1.peek();
            int top2 = s2.peek();
            int top3 = s3.peek();

            if (top1 == top2 && top2 == top3) {
                return top1;
            }

            if (top1 >= top2 && top1 >= top3) {
                s1.pop();
            } else if (top2 >= top1 && top2 >= top3) {
                s2.pop();
            } else {
                s3.pop();
            }
        }

        return 0;
    }

    private static Stack<Integer> getSum(List<Integer> heights) {
        Stack<Integer> stack = new Stack<>();
        int total = 0;
        for (int i = heights.size() - 1; i >= 0; i--) {
            total += heights.get(i);
            stack.push(total);
        }
        return stack;
    }
}

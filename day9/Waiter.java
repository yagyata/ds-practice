package day9;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Waiter {
    public static List<Integer> waiter(List<Integer> number, int q) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        List<Integer> primeNo = new ArrayList<>();

        int n = 2;
        while(primeNo.size() < q) {
            boolean isPrime = true;
            for(int p : primeNo) {
                if(n%p == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                primeNo.add(n);
            }
            n++;
        }

        Stack<Integer> curr = new Stack<>();

        for (int i = 0; i < number.size(); i++) {
            curr.push(number.get(i));
        }

        for(int i=0; i<q; i++) {
            Stack<Integer> a = new Stack<>();
            Stack<Integer> b = new Stack<>();

            int prime = primeNo.get(i);

            while(!curr.isEmpty()) {
                int num = curr.pop();
                if(num % prime == 0) {
                    b.push(num);
                } else {
                    a.push(num);
                }
            }

            while(!b.isEmpty()) {
                result.add(b.pop());
            }

            curr = a;
        }

        while(!curr.isEmpty()) {
            result.add(curr.pop());
        }

        return result;
    }
}

package day7;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class DownToZero {
    static class Pair{
        int first;
        int second;

        public Pair(int a,int b){
            first = a;
            second = b;
        }
    }

    public static int downToZero(int n) {
        // Write your code here
        Queue<Pair> q = new LinkedList<>();
        Set<Integer> s = new HashSet<>();

        q.add(new Pair(n, 0));
        s.add(n);

        while(!q.isEmpty()){
            Pair curr = q.poll();
            int num = curr.first;
            int moves = curr.second;

            if(num == 0) return moves;

            if(!s.contains(num-1)){
                q.add(new Pair(num-1, moves+1));
                s.add(num-1);
            }

            for(int i=2 ; i*i <= num ; i++){
                if(num % i == 0){
                    int a = i;
                    int b = num/i;

                    int maxAB = Math.max(a,b);

                    if(!s.contains(maxAB)){
                        q.add(new Pair(maxAB, moves+1));
                        s.add(maxAB);
                    }
                }
            }
        }

        return -1;

    }
}

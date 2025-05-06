package day1;

import java.util.*;

public class TwoDArray {

    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<4; i++) {
            for(int j=0; j<4; j++) {
                int firstRow = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2);
                int secondRow = arr.get(i+1).get(j+1);
                int thirdRow = arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);

                int sum = firstRow + secondRow + thirdRow;
                maxSum = Math.max(sum, maxSum);
            }
        }
        return maxSum;
    }

}



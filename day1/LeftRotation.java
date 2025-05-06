package day1;

import java.util.ArrayList;
import java.util.List;

public class LeftRotation {
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
        List<Integer> newArr = new ArrayList<>();
        for(int i=d; i<arr.size(); i++){
            newArr.add(arr.get(i));
        }
        for(int i=0; i<d; i++){
            newArr.add(arr.get(i));
        }
        return newArr;
    }
}

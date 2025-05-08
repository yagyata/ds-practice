package day2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountTriplets {
    static long countTriplets(List<Long> arr, long r) {
        long count = 0;
        Map<Long,Long> map1 = new HashMap<>();
        Map<Long,Long> map2 = new HashMap<>();
        for(int i=0;i<arr.size();i++){
            if(map2.containsKey(arr.get(i))){
                map2.put(arr.get(i),map2.get(arr.get(i))+1);
            }
            else{
                map2.put(arr.get(i),1L);
            }
        }
        for(int i=0;i<arr.size();i++){
            map2.put(arr.get(i),map2.get(arr.get(i))-1);
            if(arr.get(i)%r==0){
                long lc = map1.getOrDefault(arr.get(i)/r, 0L);
                long rc = map2.getOrDefault(arr.get(i)*r, 0L);
                count += lc*rc ;
            }
            if(map1.containsKey(arr.get(i))){
                map1.put(arr.get(i),map1.get(arr.get(i))+1);
            }
            else{
                map1.put(arr.get(i),1L);
            }
        }
        return count;

    }
}

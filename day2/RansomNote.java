package day2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RansomNote {
    public static void checkMagazine(List<String> magazine, List<String> note) {
        // Write your code here
        Map<String,Integer> magMap = new HashMap<>();
        Map<String,Integer> noteMap = new HashMap<>();

        for(String s1 : magazine) {
            if(magMap.containsKey(s1)) {
                magMap.put(s1, magMap.get(s1)+1);
            } else {
                magMap.put(s1,1);
            }
        }

        for(String s2 : note) {
            if(noteMap.containsKey(s2)){
                noteMap.put(s2, noteMap.get(s2)+1);
            } else {
                noteMap.put(s2, 1);
            }
        }

        String ans = "Yes";
        for (Map.Entry<String, Integer> entry : noteMap.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();

            if (!magMap.containsKey(word) || magMap.get(word) < count) {
                ans = "No";
                break;
            }
        }
        System.out.println(ans);
    }
}

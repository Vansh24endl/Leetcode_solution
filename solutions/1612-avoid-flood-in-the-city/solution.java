import java.util.*;

public class Solution {
    public int[] avoidFlood(int[] rains) {
        int n = rains.length;
        int[] result = new int[n];
        
        for (int i = 0; i < n; i++) {
            if (rains[i] > 0) {
                result[i] = -1;
            } else {
                result[i] = 1; 
            }
        }
        
        Map<Integer, Integer> lastRainDay = new HashMap<>();
        TreeSet<Integer> dryDays = new TreeSet<>();
        
        for (int i = 0; i < n; i++) {
            if (rains[i] == 0) {
                dryDays.add(i);
            } else {
                int lake = rains[i];
                if (lastRainDay.containsKey(lake)) {
                    Integer dryDay = dryDays.higher(lastRainDay.get(lake));
                    
                    if (dryDay == null || dryDay >= i) {
                        return new int[0];
                    }
                    
                    result[dryDay] = lake;
                    dryDays.remove(dryDay);
                }
                lastRainDay.put(lake, i);
            }
        }
        return result;
    }
}

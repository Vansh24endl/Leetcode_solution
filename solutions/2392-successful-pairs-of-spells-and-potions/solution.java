import java.util.Arrays;

public class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        
        Arrays.sort(potions);
        int n = spells.length;
        int m = potions.length;
        int[] result = new int[n];
        
        for (int i = 0; i < n; i++) {
            int spell = spells[i];
            
            long minPotion = (success + spell - 1) / spell;
            if (minPotion > potions[m - 1]) {
                result[i] = 0;
                continue;
            }
            
            if (minPotion <= potions[0]) {
                result[i] = m;
                continue;
            }
            
            int left = 0, right = m - 1;
            int firstValidIndex = m; 
            
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (potions[mid] >= minPotion) {
                    firstValidIndex = mid;
                    right = mid - 1; 
                } else {
                    left = mid + 1;
                }
            }            
            result[i] = m - firstValidIndex;
        }
        
        return result;
    }
}

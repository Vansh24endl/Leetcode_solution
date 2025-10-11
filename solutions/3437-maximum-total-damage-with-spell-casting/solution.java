import java.util.*;

public class Solution {
    public long maximumTotalDamage(int[] power) {
        Map<Integer, Long> damageSum = new HashMap<>();
        for (int p : power) {
            damageSum.put(p, damageSum.getOrDefault(p, 0L) + p);
        }
        
        List<Integer> damages = new ArrayList<>(damageSum.keySet());
        Collections.sort(damages);
        
        int n = damages.size();
        if (n == 0) return 0;
        
        long[] dp = new long[n];
        dp[0] = damageSum.get(damages.get(0));
        
        int validPrev = -1;
        
        for (int i = 1; i < n; i++) {
            int current = damages.get(i);
            
            while (validPrev + 1 < i && damages.get(validPrev + 1) <= current - 3) {
                validPrev++;
            }
            
            dp[i] = dp[i - 1];
            
            long takeCurrent = damageSum.get(current);
            if (validPrev >= 0) {
                takeCurrent += dp[validPrev];
            }
            
            dp[i] = Math.max(dp[i], takeCurrent);
        }
        
        return dp[n - 1];
    }
}

public class Solution {
    public long minTime(int[] skill, int[] mana) {
        int n = skill.length;
        int m = mana.length;
        
        if (m == 0) return 0;
        
        long[] prefixSkill = new long[n];
        prefixSkill[0] = skill[0];
        for (int i = 1; i < n; i++) {
            prefixSkill[i] = prefixSkill[i-1] + skill[i];
        }
        
        long[] startTime = new long[m];
        startTime[0] = 0;
        
        for (int j = 1; j < m; j++) {
            long maxConstraint = 0;
            for (int i = 0; i < n; i++) {
                long constraint = startTime[j-1] + prefixSkill[i] * mana[j-1];
                if (i > 0) {
                    constraint -= prefixSkill[i-1] * mana[j];
                }
                if (constraint > maxConstraint) {
                    maxConstraint = constraint;
                }
            }
            startTime[j] = maxConstraint;
        }
        return startTime[m-1] + prefixSkill[n-1] * mana[m-1];
    }
}

class Solution {
    public String removeDuplicateLetters(String s) {
        int n = s.length();
        boolean[] taken = new boolean[26];
        int[] lastIndex = new int[26];

        for(int i=0; i<n; i++){
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        StringBuilder result = new StringBuilder();

        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            int idx = ch -'a';
            if(taken[idx]) continue;

            while(result.length() > 0 && result.charAt(result.length() - 1) > ch && lastIndex[result.charAt(result.length() - 1) - 'a'] > i){
                taken[result.charAt(result.length() - 1) - 'a'] = false;
                result.deleteCharAt(result.length() - 1);
            }
            result.append(ch);
            taken[idx] = true;
        }
        return result.toString();
    }
}

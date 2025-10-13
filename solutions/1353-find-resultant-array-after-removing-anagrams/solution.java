import java.util.*;

class Solution 
{
    public List<String> removeAnagrams(String[] words) 
    {
        List<String> result = new ArrayList<>();
        result.add(words[0]);
        String lastKept = words[0];
        
        for (int i = 1; i < words.length; i++) 
        {
           if (!isAnagram(lastKept, words[i])) 
            {
                result.add(words[i]);
                lastKept = words[i];
            }
        }  
        return result;
    }
    
    private boolean isAnagram(String s1, String s2) 
    {
        if (s1.length() != s2.length()) 
        {
            return false;
        }
        
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);
    }
}

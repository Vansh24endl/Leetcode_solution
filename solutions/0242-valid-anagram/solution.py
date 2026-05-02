class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # s,t
        # if(sorted(s) == sorted(t)):
        #     return True
        # else:
        #     return False
        if len(s) != len(t):
            return False
        else:
            for ch in set(s):
                if t.count(ch) != s.count(ch):
                    return False
            return True

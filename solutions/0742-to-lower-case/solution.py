class Solution:
    def toLowerCase(self, s: str) -> str:
        # return s.lower()
        result = ""
    
        for i in s:
            if 'A' <= i <= 'Z':
                result +=  chr(ord(i) + 32)
            else:
                result += i
        return result

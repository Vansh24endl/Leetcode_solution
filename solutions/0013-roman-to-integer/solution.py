class Solution:
    def romanToInt(self, s: str) -> int:
        table = {
            "I": 1, "V": 5, "X": 10, "L": 50,
            "C": 100, "D": 500, "M": 1000
        }
        
        sm = 0
        prev = 0
        
        for ch in reversed(s):
            if table[ch] < prev:
                sm -= table[ch]
            else:
                sm += table[ch]
            prev = table[ch]
        
        return sm

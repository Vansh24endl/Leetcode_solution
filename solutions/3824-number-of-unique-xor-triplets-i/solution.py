import math

class Solution:
    def uniqueXorTriplets(self, nums: list[int]) -> int:
        n = len(nums)
        if n <= 2:
            return n
        
        # Find the number of bits required to represent n
        bit_length = int(math.log2(n)) + 1
        return 1 << bit_length


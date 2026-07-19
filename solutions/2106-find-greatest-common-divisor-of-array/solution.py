import math
class Solution:
    def findGCD(self, nums: List[int]) -> int:
        # min_val = min(nums)
        # max_val = max(nums)

        # new_nums = [min_val, max_val]
        
        # result = math.gcd(*new_nums)

        # return result
        return gcd(min(nums), max(nums))

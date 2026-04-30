class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]: 
        # n = len(nums)
        # for i in range(n):
        #     for j in range(i+1, n):
        #         if nums[i]+nums[j] == target:
        #             return [i,j]
        num_map = {}
        for i, num in enumerate(nums):
            comp = target - num
            if comp in num_map:
                return[num_map[comp],i]
            num_map[num] = i
        return [-1,-1]

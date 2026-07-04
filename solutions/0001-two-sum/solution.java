class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        for(int i =1; i<nums.length; i++)
        {
            for(int j = i; j<nums.length; j++)
            {
                if(nums[j-i] + nums[j] == target) return new int[]{j-i,j};
                // {
                //     arr[0] = i;
                //     arr[1] = j;
                //     break;
                // }
            }
        }
        return new int[]{};
    }
}

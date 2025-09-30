class Solution {
    public int triangularSum(int[] nums) 
    {
   int[] nums2 = nums;
        int n = nums2.length;

        while (n > 1) {
            for (int i = 0; i < n - 1; i++) {
                nums2[i] = (nums2[i] + nums2[i + 1]) % 10;
            }
            n--; 
        }
        return nums2[0];
    }
}

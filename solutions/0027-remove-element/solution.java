 class Solution {
    public int removeElement(int[] nums, int val) {

        int temp = 0;
        int s = 0;
        int z = 0;

        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] == val) {
                z++;
            }
        }

        for (int j = 0; j < z; j++) {

            for (int i = 0; i <= nums.length - 1; i++) {
                if (nums[i] == val) {
                    s = i;
                    break;
                }
            }

            int e = nums.length - 1;
            while (s < e) {
                temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                e--;
            }
        }

        return nums.length - z;
    }
}

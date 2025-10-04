class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int max = 0;
        while (i < j) {
            int width = j - i;
            if (height[i] < height[j]) {
                if (max < width * height[i]){
                    max = width * height[i];
                }
                i++;
            } else {
                if (max < width * height[j]) {
                    max = width * height[j];
                }
                j--;
            }
        }

        return max;
    }
}

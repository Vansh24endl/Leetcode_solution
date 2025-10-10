public class Solution 
{
    public int maximumEnergy(int[] energy, int k) 
    {
        int n = energy.length;
        int[] maxSum = new int[k];
        int[] currentSum = new int[k];
        
        for (int i = 0; i < k; i++) 
        {
            maxSum[i] = Integer.MIN_VALUE;
        }
        
        for (int i = n - 1; i >= 0; i--) 
        {
            int r = i % k;
            currentSum[r] += energy[i];
            if (currentSum[r] > maxSum[r]) 
            {
                maxSum[r] = currentSum[r];
            }
        }
        int result = maxSum[0];
        for (int i = 1; i < k; i++) 
        {
            if (maxSum[i] > result) 
            {
                result = maxSum[i];
            }
        }
        
        return result;
    }
}

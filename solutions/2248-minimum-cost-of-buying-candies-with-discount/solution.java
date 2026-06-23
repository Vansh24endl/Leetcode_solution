class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);

        int totalcost = 0;
        int count = 0;

        for(int i = cost.length-1; i >= 0; i--){
            count++;
            if(count %3 !=0){
                totalcost += cost[i];
            }
        }
        return totalcost;
        // int total = 0;

        // for(int i = cost.length - 1; i>=0; i-=3)
        // {
        //     total += cost[i];
        //     if(i - 1 >= 0)
        //     {
        //         total += cost[i-1];
        //     }
        // }
        // return total;
    }
}

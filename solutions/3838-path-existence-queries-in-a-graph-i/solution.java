class Solution {

    public boolean[] pathExistenceQueries(
        int n,
        int[] nums,
        int maxDiff,
        int[][] queries
    ) {
        int[] tags = new int[n];
        for (int i = 1; i < n; i++) {
            if (nums[i] - nums[i - 1] > maxDiff) {
                tags[i] = tags[i - 1] + 1;
            } else {
                tags[i] = tags[i - 1];
            }
        }

        boolean[] res = new boolean[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int x = queries[i][0];
            int y = queries[i][1];
            res[i] = tags[x] == tags[y];
        }
        return res;
    }
}

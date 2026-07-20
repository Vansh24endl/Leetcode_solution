import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int t = m * n;

        k = k % t;
        List<List<Integer>> r = new ArrayList<>();

        for(int i=0; i<m; i++){
            List<Integer> ro = new ArrayList<>();
            for(int j=0; j<n; j++){
                int c1D = i*n+j;
                int o1D = (c1D - k + t)%t;

                ro.add(grid[o1D / n][o1D % n]);
            }
            r.add(ro);
        }
        return r;
    }
}

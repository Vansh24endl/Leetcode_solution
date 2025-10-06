import java.util.*;

public class Solution {
    public int swimInWater(int[][] grid) {
        int n = grid.length;
        if (n == 1) return grid[0][0];
        
        // Directions for 4-connected neighbors: up, down, left, right
        int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        
        // Min-heap: {maxElevationSoFar, row, col}
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        boolean[][] visited = new boolean[n][n];
        
        pq.offer(new int[]{grid[0][0], 0, 0});
        visited[0][0] = true;
        
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int maxElev = curr[0];
            int i = curr[1];
            int j = curr[2];
            
            // Reached bottom-right corner
            if (i == n - 1 && j == n - 1) {
                return maxElev;
            }
            
            // Explore neighbors
            for (int[] dir : dirs) {
                int ni = i + dir[0];
                int nj = j + dir[1];
                
                if (ni >= 0 && ni < n && nj >= 0 && nj < n && !visited[ni][nj]) {
                    visited[ni][nj] = true;
                    int newMax = Math.max(maxElev, grid[ni][nj]);
                    pq.offer(new int[]{newMax, ni, nj});
                }
            }
        }
        
        return -1; // Should never reach here per problem constraints
    }
}

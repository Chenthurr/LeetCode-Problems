class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int ans[][] = new int[m + 1 - k][n + 1 - k]; 
        for (int i = 0; i <= m - k; i++) {
            for (int j = 0; j <= n - k; j++) {
                TreeSet<Integer> ts = new TreeSet<>();
                for (int x = i; x < i + k; x++) {
                    for (int y = j; y < j + k; y++) {
                        ts.add(grid[x][y]);
                    }
                }
                int min = 999999999;
                Integer prev = null;
                for (Integer curr : ts) {
                    if (prev != null) {
                        min = Math.min(min,curr - prev);
                    }
                    prev = curr;
                }
                if (min == 999999999)
                    ans[i][j] = 0;
                else
                    ans[i][j] = min;
            }
        }
        return ans;
    }
}
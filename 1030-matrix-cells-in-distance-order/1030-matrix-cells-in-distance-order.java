class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
       
        final int[][] directions = new int[][]{{0, -1}, {-1, 0}, {1, 0}, {0, 1}};

        Queue<Integer[]> q = new LinkedList<>();
        boolean[][] seen = new boolean[rows][cols];

        q.add(new Integer[]{rCenter, cCenter});
        seen[rCenter][cCenter] = true;

        int[][] result = new int[rows * cols][];
        int i = 0;
        while(!q.isEmpty()){
            Integer[] curr = q.remove();
            result[i++] = new int[]{curr[0], curr[1]};

            for(int[] d : directions){
                int r = curr[0] + d[0];
                int c = curr[1] + d[1];

                if(r >= 0 && c >= 0 && r < rows && c < cols && !seen[r][c]){
                    seen[r][c] = true;
                    q.add(new Integer[]{r, c});
                }
            }
        }
        return result;
    }
}
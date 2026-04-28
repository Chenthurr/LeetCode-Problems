import java.util.*;

class Solution {
    public int minOperations(int[][] grid, int x) {
        List<Integer> list = new ArrayList<>();

        for (int[] row : grid) {
            for (int val : row) {
                list.add(val);
            }
        }

        Collections.sort(list);
        int median = list.get(list.size() / 2);

        int operations = 0;
        for (int num : list) {
            int diff = Math.abs(num - median);
            if (diff % x != 0) return -1;
            operations += diff / x;
        }

        return operations;
    }
}
class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int xor = 0;
        int mod = 1000000007;

        for (int[] q : queries) {
            for (int i = q[0]; i <= q[1]; i += q[2]) {
                long temp = (long) nums[i] * q[3];
                nums[i] = (int) (temp % mod);
            }
        }

        for (int num : nums) {
            xor ^= num;
        }

        return xor;
    }
}
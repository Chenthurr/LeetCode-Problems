class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;

        int sum=0; int mx=0;
        int origsum=0;
        for(int i=0;i<n;i++) {
            sum+=i*nums[i];
            origsum+=nums[i];
        }

        mx = sum;

        for(int i=n-1;i>=0;i--)
        {
            sum +=  ( (origsum) - n*nums[i] );
            mx = Math.max(mx,sum);
        }

        return mx;
    }
}

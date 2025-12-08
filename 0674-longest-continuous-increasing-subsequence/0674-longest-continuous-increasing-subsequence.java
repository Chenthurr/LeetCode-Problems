class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length == 0) return 0;

        int currLength = 1;
        int maxLength = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i - 1]){
                currLength++;
                maxLength = Math.max(maxLength, currLength);
            } else {
                currLength = 1;
            }
        }
        return maxLength;
    }
}
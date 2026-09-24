class Solution {
    public int smallestIndex(int[] nums) {
        int indx =-1;
        int n =nums.length;

        for(int i=0; i <n; i++){
            int sum=0;

            while(nums[i] > 0){
                int digit =nums[i]%10;
                sum += digit;
                nums[i] =nums[i]/10;
            }

            if(sum == i){
                indx = i;
                return indx;
            }
        }

        return indx;
    }
}
class Solution {

    private TreeNode helper(int[] nums, int s, int e){
        if(s > e)
            return null;
        int mid = s + (e - s) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums, s, mid - 1);
        node.right = helper(nums, mid + 1, e);
        return node;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        int n = nums.length;
        if(n == 0)
            return null;
        return helper(nums, 0, n - 1);
    }
}
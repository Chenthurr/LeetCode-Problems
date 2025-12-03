class Solution {
    public int bs(int[] arr, int l, int h, int t) {
        if (l > h) {
            return -1;
        }

        int mid = (l + h) / 2;

        if (arr[mid] == t) {
            return mid;
        } else if (t > arr[mid]) {
            return bs(arr, mid + 1, h, t);
        }

        return bs(arr, l, mid - 1, t);

    }

    public int search(int[] nums, int target) {
        int n = nums.length;
        int l = 0, h = n - 1;
        return bs(nums, l, h, target);
    }

}
class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int ans[] = new int[num_people], i = 1, pos = 0;
        while (candies > 0) {
            ans[pos++] += candies >= i ? i : candies;
            candies -= i;
            i++;
            pos %= num_people;
        }
        return ans;
    }
}
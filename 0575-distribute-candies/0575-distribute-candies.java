class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        int caneat = n/2;

        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<n;i++){
            hs.add(candyType[i]);
        }

        return Math.min(hs.size(),caneat);
    }
}
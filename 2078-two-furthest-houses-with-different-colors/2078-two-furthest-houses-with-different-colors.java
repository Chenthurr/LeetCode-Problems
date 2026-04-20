class Solution {
    public int maxDistance(int[] c) {
        int mx=0;
        for(int i = 0;i<c.length;i++){
            for(int j = i+1;j<c.length;j++){
                if(c[i]!=c[j]) mx = Math.max(mx,j-i);
            }
        }
        return mx;
    }
}
class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        
        int m = grid.length;
        int n = grid[0].length;
        
        int[] arr = new int[m*n];
        int z = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[z++] = grid[i][j];
            }
        }
        int len = arr.length;
        if(k>len){
            k%=len; 
        }
        int[] temp = new int[len];
        for(int i=0;i<k;i++){
            temp[i] = arr[len-k+i];
        }
        int j = 0;
        for(int i=k;i<len;i++){
            temp[i] = arr[j++];
        }
       
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0;i<len;i+=n){
            List<Integer> sub = new ArrayList<>();
            for(int x = i;x<i+n;x++){
                sub.add(temp[x]);
            }
            ans.add(sub);
        }
        return ans;

    }
}
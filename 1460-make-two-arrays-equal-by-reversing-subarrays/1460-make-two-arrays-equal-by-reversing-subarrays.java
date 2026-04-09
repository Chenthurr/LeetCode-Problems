class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int t = target.length;
        int a = arr.length;
        Arrays.sort(target);
        Arrays.sort(arr);
        for(int i=0;i<t;i++)
        {
                if(a!=t)
                {
                    return false;
                }
                 
                 if(arr[i]!=target[i])
                 {
                    return false;
                 }
            
        }
        return true;
    }
}
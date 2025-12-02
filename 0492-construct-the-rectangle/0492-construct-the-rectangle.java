class Solution {
    public int[] constructRectangle(int area) {
      int ans[]=new int[2];  
      int L=0;
      int W=(int) Math.sqrt(area);
      if((area<1)||(area>Math.pow(10,7)))
      return ans;
      while(area%W!=0){
        W--;
      }
      L=area/W;
      ans[0]=L;
      ans[1]=W;
      return ans;
    }
}
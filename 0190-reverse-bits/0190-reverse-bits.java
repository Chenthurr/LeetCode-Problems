class Solution {
    public int reverseBits(int n) {
       String s = Integer.toBinaryString(n);
       String s1=String.format("%32s", s).replace(' ', '0');
       StringBuilder rs = new StringBuilder(s1).reverse();
       return (int) Long.parseLong(rs.toString(),2);
      

    }
}
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> m=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            m.put(c,m.getOrDefault(c,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            m.put(c,m.getOrDefault(c,0)-1);
            if(m.get(c)==0)
                m.remove(c);
        }
        return m.isEmpty();
    }
}
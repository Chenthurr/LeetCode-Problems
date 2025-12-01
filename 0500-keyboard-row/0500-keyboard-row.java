class Solution {
    public String[] findWords(String[] words) {
       String rows[]={"qwertyuiop","asdfghjkl","zxcvbnm"};
       String temp[]=new String[words.length];
       int c=0;

       for(int i=0;i<words.length;i++){
           String word=words[i].toLowerCase();
             int index=-1; 
        for(int j=0;j<rows.length;j++){
            if(rows[j].indexOf(word.charAt(0))!=-1){
                index=j;
                break;
            }
        }
        
        boolean ok=true;
        for(int k=0;k<word.length();k++){
            if(rows[index].indexOf(word.charAt(k))==-1){
                ok=false;
                break;
            }
        }

        if(ok){
            temp[c]=words[i];
            c++;
        }
       }

        String ans[]=new String[c];
         for(int k=0;k<c;k++){
            ans[k]=temp[k];
         }
    return ans;
    }
}
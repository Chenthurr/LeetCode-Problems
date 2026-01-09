class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int pointer1 = 0; 
        int pointer2 = 0;    
        int idx1 = 0;      
        int idx2 = 0;      
        while (pointer1 < word1.length && pointer2 < word2.length) {
            char char1 = word1[pointer1].charAt(idx1);
            char char2 = word2[pointer2].charAt(idx2);

            if (char1 != char2) {
                return false;
            }

            idx1++;
            idx2++;

            if (idx1 == word1[pointer1].length()) {
                idx1 = 0;  
                pointer1++;
            }

            if (idx2 == word2[pointer2].length()) {
                idx2 = 0;
                pointer2++;
            }
        }
        return pointer1 == word1.length && pointer2 == word2.length;        
    }
}
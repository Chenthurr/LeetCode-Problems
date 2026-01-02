class Solution {
    public int repeatedNTimes(int[] A) {
        for (int i = 0; i < A.length - 1; i++)
            if (A[i] == A[i + 1] || (i + 2 < A.length && A[i] == A[i + 2]))
                return A[i];
        
        return A[0];
    }
}

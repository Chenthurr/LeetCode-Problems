class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (words[i].equals(target)) {
                int rightDist = (i - startIndex + n) % n;
                int leftDist  = (startIndex - i + n) % n;
                minDistance = Math.min(minDistance, Math.min(rightDist, leftDist));
            }
        }

        return minDistance == Integer.MAX_VALUE ? -1 : minDistance;
    }
}
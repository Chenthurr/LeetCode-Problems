class Solution {
    private boolean isP(String s, int i, int j) {
        while (i <= j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }

    private void solve(String s, int i, List<List<String>> res, List<String> ans) {
        if (i == s.length()) {
            res.add(new ArrayList<>(ans));
            return;
        }

        for (int k = i; k < s.length(); k++) {
            if (isP(s, i, k)) {
                ans.add(s.substring(i, k + 1));
                solve(s, k + 1, res, ans);
                ans.remove(ans.size() - 1);
            }
        }
    }

    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        solve(s, 0, res, new ArrayList<>());
        return res;
    }
}
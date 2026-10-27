class Solution {
    public String[] createGrid(int m, int n) {
        char ans[][] = new char[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = '#';
            }
        }

        for (int i = 0; i < n; i++) {
            ans[0][i] = '.';
        }

        for (int j = 0; j < m; j++) {
            ans[j][n - 1] = '.';
        }

        String[] ans1 = new String[m];

        for (int i = 0; i < m; i++) {
            ans1[i] = new String(ans[i]);
        }

        return ans1;
    }
}
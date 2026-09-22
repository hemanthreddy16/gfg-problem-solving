class Solution {
    public int rowWithMax1s(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int ans = -1;
        int maxOnes = 0;

        for (int i = 0; i < n; i++) {
            int low = 0;
            int high = m - 1;

            while (low <= high) {
                int mid = (low + high) / 2;

                if (mat[i][mid] == 1) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            int ones = m - low;

            if (ones > maxOnes) {
                maxOnes = ones;
                ans = i;
            }
        }

        return ans;
    }
}
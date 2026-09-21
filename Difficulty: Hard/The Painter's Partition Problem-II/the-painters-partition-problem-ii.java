class Solution {

    public int minTime(int[] arr, int k) {

        int low = 0;
        int high = 0;

        for (int board : arr) {
            low = Math.max(low, board);
            high += board;
        }

        int ans = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (canPaint(arr, k, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public boolean canPaint(int[] arr, int k, int maxWork) {

        int painters = 1;
        int currentWork = 0;

        for (int board : arr) {

            if (currentWork + board <= maxWork) {
                currentWork += board;
            } else {
                painters++;
                currentWork = board;
            }
        }

        return painters <= k;
    }
}
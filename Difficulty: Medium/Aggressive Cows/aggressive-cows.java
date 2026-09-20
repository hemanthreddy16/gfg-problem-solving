

class Solution {

    public int aggressiveCows(int[] stalls, int k) {

        Arrays.sort(stalls);

        int low = 1;
        int high = stalls[stalls.length - 1] - stalls[0];
        int ans = 0;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (canPlace(stalls, k, mid)) {
                ans = mid;
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public boolean canPlace(int[] stalls, int k, int distance) {

        int cows = 1;
        int lastPosition = stalls[0];

        for (int i = 1; i < stalls.length; i++) {

            if (stalls[i] - lastPosition >= distance) {
                cows++;
                lastPosition = stalls[i];
            }

            if (cows >= k) {
                return true;
            }
        }

        return false;
    }
}
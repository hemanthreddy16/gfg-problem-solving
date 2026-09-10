class Solution {
    public ArrayList<Integer> fibonacciNumbers(int n) {
        ArrayList<Integer> result = new ArrayList<>();

        if (n >= 1) {
            result.add(0);
        }

        if (n >= 2) {
            result.add(1);
        }

        int prev2 = 0;
        int prev1 = 1;

        for (int i = 2; i < n; i++) {
            int current = prev1 + prev2;
            result.add(current);

            prev2 = prev1;
            prev1 = current;
        }

        return result;
    }
}
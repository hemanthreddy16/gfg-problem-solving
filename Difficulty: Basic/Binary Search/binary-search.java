class Solution {

    
    public boolean binarySearch(int[] arr, int k) {
        return binarySearch(arr, 0, arr.length - 1, k);
    }

   
    public boolean binarySearch(int[] arr, int low, int high, int k) {

        if (low > high) {
            return false;
        }

        int mid = (low + high) / 2;

        if (arr[mid] == k) {
            return true;
        }
        else if (arr[mid] > k) {
            return binarySearch(arr, low, mid - 1, k);
        }
        else {
            return binarySearch(arr, mid + 1, high, k);
        }
    }
}
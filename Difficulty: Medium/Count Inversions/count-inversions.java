class Solution {

    public long inversionCount(int arr[]) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    long mergeSort(int[] arr, int low, int high) {

        if (low >= high) {
            return 0;
        }

        int mid = (low + high) / 2;

        long count = 0;

        count += mergeSort(arr, low, mid);
        count += mergeSort(arr, mid + 1, high);
        count += merge(arr, low, mid, high);

        return count;
    }

    long merge(int[] arr, int low, int mid, int high) {

        int[] temp = new int[high - low + 1];

        int left = low;
        int right = mid + 1;
        int k = 0;

        long count = 0;

        while (left <= mid && right <= high) {

            if (arr[left] <= arr[right]) {
                temp[k] = arr[left];
                left++;
            } else {
                temp[k] = arr[right];
                right++;

                count += (mid - left + 1);
            }

            k++;
        }

        while (left <= mid) {
            temp[k] = arr[left];
            left++;
            k++;
        }

        while (right <= high) {
            temp[k] = arr[right];
            right++;
            k++;
        }

        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }

        return count;
    }
}
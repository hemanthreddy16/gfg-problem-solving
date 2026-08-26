class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        
                int l = 0;
                int h = arr.length - 1;

                while (l < h) {
                    int mid = l + (h - l) / 2;

                    if (arr[mid] > arr[h]) {
                        l = mid + 1;
                    } else {
                        h = mid;
                    }
                }

                return l;
            }
        }
    
class Solution {

    public int[] searchRange(int[] nums, int target) {

        int first = firstOcc(nums, nums.length, target);
        int last = lastOcc(nums, nums.length, target);

        return new int[]{first, last};
    }

    int firstOcc(int arr[], int n, int key) {

        int s = 0, e = n - 1;
        int ans = -1;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (arr[mid] == key) {
                ans = mid;
                e = mid - 1;      // search in left part
            } else if (key > arr[mid]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return ans;
    }

    int lastOcc(int arr[], int n, int key) {

        int s = 0, e = n - 1;
        int ans = -1;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (arr[mid] == key) {
                ans = mid;
                s = mid + 1;      // Search in right right
            } else if (key > arr[mid]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return ans;
    }
}
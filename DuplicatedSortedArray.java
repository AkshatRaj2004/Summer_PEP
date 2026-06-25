public class DuplicatedSortedArray {
    static int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            // Target found
            if (arr[mid] == target) {
                return mid;
            }
            // Duplicates: cannot determine the sorted half
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low++;
                high--;
                continue;
            }
            // Left half is sorted
             if (arr[low] <= arr[mid])
              {
                if (target >= arr[low] && target < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
             }
            // Right half is sorted
            else 
            {
              if (target > arr[mid] && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {2, 2, 2, 2, 1, 2};
        int target = 1;

        System.out.println(search(arr, target));
    }
}
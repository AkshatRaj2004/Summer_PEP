public class LastOccurrence {
    static int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                ans = mid;
                low = mid + 1;
            }
            else if (arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 10, 10, 11, 12,12,12,13};
        int index = search(arr, 12);
        if (index != -1)
            System.out.println("Last occurrence index is " + index);
        else
            System.out.println("Not found");
    }
}
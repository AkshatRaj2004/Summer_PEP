public class BinarySearch {
    static int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 10, 11, 12, 13 };
        int index = search(arr, 10);
        if (index != -1) {
            System.out.println("Index is " + index);
        } else {
            System.out.println("Not found");
        }
    }
}
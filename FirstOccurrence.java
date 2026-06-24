public class FirstOccurrence {
    static int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                result = mid; 
                high = mid - 1; 
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result; 
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 10, 10, 11, 12, 13 };
        int index = search(arr, 10);
        if (index != -1) {
            System.out.println("First occurrence index is " + index);
        } else {
            System.out.println("Not found");
        }
    }
}
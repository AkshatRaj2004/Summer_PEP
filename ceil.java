public class ceil {
    static int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid; 
            } else if (arr[mid] < target) {
                low = mid + 1; 
            } else {
                ans = mid; 
                high = mid - 1; 
            }
        }
        return ans; 
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 10, 11, 12, 13 };
        int index = search(arr, 6);
        if (index != -1) {
            System.out.println("Ceil value is " + arr[index]);
        } else {
            System.out.println("Not found");
        }
    }
}
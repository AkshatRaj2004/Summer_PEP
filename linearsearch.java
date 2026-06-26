public class linearsearch {
    static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;    
            }
        }
        return -1;   
    }

    public static void main(String[] args) 
    {
        int[] arr = {4,5,6,7,8,0,1};
        int target = 0;
        System.out.println(search(arr, target));
    }
}

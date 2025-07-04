//find floor of a number.
public class LeedCode4 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 9, 16, 67};
        int target = 6;
        System.out.println(floor(arr, target));
    }
   // return the index: greatest number<=target
    static int floor(int[] arr, int target) {


        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (target > arr[mid]) {
                start = mid + 1;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            }
        }
        return end;
    }
}

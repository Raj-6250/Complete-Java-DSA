// find an element in the mountain array(SEARCHING IN MOUNTAIN ARRAY).

public class LeedCode9 {
     public static void main(String[] args) {
        int[] arr={2,4,5,7,9,13,10,8,3,1};
        int target=4;
        System.out.println(search(arr,target));

    }

    static int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry=BinarySearch(arr,target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }
        //try to search in second half
        return BinarySearch(arr, target,peak+1,arr.length-1);
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                //means you are in the decending part of array.
                //this may be the ans but look at left.
                end = mid;
            } else {
                //you are in the ascending part of the array becoz
                // arr[mid]<arr[mid+1];
                start = mid + 1;
            }
        }
        // in the end, start==end and pointing to the largest number because of the two check above.
        // start and the end are always trying to find max element in the above two check
        //hence when they are pointing to just one element, that is the max one becoz that is what the check says
        //more elaboration: at every point of time for start and end, they have the best possible ans till that time
        //and if we are saying that only one item is remaining,  hence becoz of above line that is the best possible ans.
        return start; // or return end as  both are equal.
    }

    static int BinarySearch(int[] arr, int target,int start,int end) {
//        int start = 0;
//        int end = arr.length - 1;
        //find whether the array is sorted in ascending or descending order.
        boolean IsAscending;
        if (arr[start] < arr[end]) {
            IsAscending = true;
        } else {
            IsAscending = false;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (IsAscending) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else if (arr[mid] > target) {
                    end = mid - 1;

                }
            } else {
                if (arr[mid] < target) {
                    end = mid - 1;
                } else if (arr[mid] > target) {
                    start = mid + 1;

                }
            }
        }

        return -1;
    }
}

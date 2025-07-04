public class LeedCode11 {
    public static void main(String[] args) {
        int[] arr={4,4,5,6,7,0,1,1,2};
        int target=4;
        System.out.println(search(arr,target));


    }
    static int search(int[] arr,int target){
        int pivot=findPivotWithDuplicates(arr);

        // if you do not find a pivot , it means the array is not rotated.
        if(pivot == -1){
            // just do normal binary search
            return BinarySearch(arr,target,0,arr.length-1);
        }

        // if pivot is found , you have found 2 ascending sorted array.
        if(target == arr[pivot]){
            return pivot;
        }
        if(target >= arr[0]){
            return BinarySearch(arr,target,0,pivot-1);
        }
        return BinarySearch(arr, target,pivot+1,arr.length-1);
    }
    static int BinarySearch(int[] arr, int target, int start, int end){
//        int start=0;
//        int end=arr.length-1;
        while(start<=end){
            //**find the mid element
            // mid = (start+end)/2
            //might be possible that (start+mid) exceeds the range of integer.
            int mid=start+(end-start)/2;
            if(arr[mid]<target){
                start=mid+1;
            }
            else if (arr[mid]>target){
                end=mid-1;

            }
            else{
                return mid;
            }
        }
        return -1;
    }
    static int findPivotWithDuplicates(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            // 4 cases over here
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
//            if(arr[mid] <= arr[start]){
//                end=mid-1;
//            }
//            else{
//                start=mid+1;
//            }
            //imp****
            // if the element at middle, start, end are equal the just skip the duplicates
            if(arr[mid] == arr[start] && arr[mid]==arr[end]){
                //skip the duplicates
                //NOTE: what if these elements at start and end were the pivot?
                //check if start is pivot
                if(arr[start] > arr[start+1]){
                    return start;
                }
                start++;

                // check whether end is pivot
                if(arr[end]<arr[mid-1]){
                    return mid-1;
                }
                end--;
            }
            //left side is sorted, so pivot should be in right.
            else if(arr[start] <arr[mid] || (arr[start] == arr[mid] && arr[mid]>arr[end])){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return -1;
    }
}

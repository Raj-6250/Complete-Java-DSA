public class LeedCode7 {
    public static void main(String[] args) {
        //supposing array to be infinite means we are not known of the size of the array.
        // we have to find an element from the infinite array.
        int[] arr={1,3,5,9,12,15,19,23,27,34,45,56,64,77,87};
        int target=87;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr,int target){
        //first find the range
        //first start with the box of the size 2.
        int start=0;
        int end=1;

        //condition for the target to lie in the range
        while(target>arr[end]){
            int newstart=end+1;

            //double the box value
            //end=previous end + sizeofobox*2
            //sizeofbox=end-(start-1) = (end - start +1);
            end=end +  (end - start + 1) * 2;
            start=newstart;
        }
        return BinarySearch( arr,  target,  start, end);
    }

    static int BinarySearch(int[] arr, int target, int start,int end){
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
}

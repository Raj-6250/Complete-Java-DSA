public class BinarySearch1 {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};
        int target=6;
        System.out.println(BinarySearch(arr,target));
    }
    static int BinarySearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
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

public class BinarySearch2 {
    public static void main(String[] args) {
        int[] arr={90,80,70,60,50,40,30,20,10};
        int target=10;
        System.out.println(BinarySearch(arr,target));
    }
    static int BinarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        //find whether the array is sorted in ascending or descending order.
        boolean IsAscending;
        if(arr[start]<arr[end]){
            IsAscending=true;
        }
        else{
            IsAscending=false;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(IsAscending) {
                if(arr[mid]<target){
                    start=mid+1;
                }
                else if (arr[mid]>target){
                    end=mid-1;

                }
            }
            else{
                if(arr[mid]<target){
                    end=mid-1;
                }
                else if (arr[mid]>target){
                    start=mid+1;

                }
            }
        }

        return -1;
    }
}

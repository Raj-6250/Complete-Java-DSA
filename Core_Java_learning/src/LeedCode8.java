//find the peak index in the mountain array.
public class LeedCode8 {
    public static void main(String[] args) {
//        int[] arr={0,1,0};
        int[] arr={0,3,4,6,7,5,4,1};
        System.out.println(peakIndexInMountainArray( arr));
    }
    static int peakIndexInMountainArray(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;

            if(arr[mid]>arr[mid+1]){
                //means you are in the decending part of array.
                //this may be the ans but look at left.
                end = mid;
            }
            else{
                //you are in the ascending part of the array becoz
                // arr[mid]<arr[mid+1];
                start=mid+1;
            }
        }
        // in the end, start==end and pointing to the largest number because of the two check above.
        // start and the end are always trying to find max element in the above two check
        //hence when they are pointing to just one element, that is the max one becoz that is what the check says
        //more elaboration: at every point of time for start and end, they have the best possible ans till that time
        //and if we are saying that only one item is remaining,  hence becoz of above line that is the best possible ans.
        return start; // or return end as  both are equal.
    }
}

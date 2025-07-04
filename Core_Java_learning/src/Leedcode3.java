// find ceiling of a number.
public class Leedcode3 {
    public static void main(String[] args) {
        int[] arr={1,3,5,8,9,16,67};
        int target=17;
        System.out.println(ceiling(arr,target));
    }
    // return the index of smallest no.>=target.
    static int ceiling(int[] arr,int target){
        //but what if the target is greater than the greatest element in the array.
        if(target>arr[arr.length-1]){
            return -1;
        }
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(target>arr[mid]){
                start=mid+1;
            }
            if(target<arr[mid]){
                end=mid-1;
            }
        }
        return start;
    }
}

import java.util.Arrays;

//Doubt
//Find First occurence and Last occurence position of target Element in sorted array.
public class LeedCode6 {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,3,3,3,4,5};
        int target=5;
//        int[] ans = SearchRange(arr,target);
        System.out.println(Arrays.toString(SearchRange(arr,target)));

    }
    public static int[] SearchRange(int[] nums, int target){
        int[] ans={-1,-1};
        //Check for the first occurence if target first
        ans[0]=Search(nums,target,true);
        ans[1]=Search(nums,target,false);
//        ans[0]=start;
//        ans[1]=end;
        return ans;
    }
    //this function just returns the index value of target.
    static int Search(int[] nums,int target,boolean findStartIndex){
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            //**find the mid element
            // mid = (start+end)/2
            //might be possible that (start+mid) exceeds the range of integer.
            int mid=start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }
            else if (target>nums[mid]){
                start=mid+1;

            }
            else{
                ans=mid;
                if(findStartIndex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}

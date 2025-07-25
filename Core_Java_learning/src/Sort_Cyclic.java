import java.util.Arrays;

public class Sort_Cyclic {
    public static void main(String[] args) {
        int[] arr={3,5,2,1,4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int[] arr){
        int i=0;

        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else{
                i++;
            }
        }
    }
//    static void cyclicSort(int[] arr){
//        for(int i=0;i<arr.length;i++){
//            int correct=arr[i]-1;
//            if(arr[i]!=arr[correct]){
//                int temp=arr[i];
//                arr[i]=arr[correct];
//                arr[correct]=temp;
//            }
//        }
//    }
}

import java.util.Arrays;

public class Sort_Insertion {
    public static void main(String[] args) {
        int[] arr={34,54,12,89,1,0};
        InsertionSort(arr);

    }
    static void InsertionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
                else{
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

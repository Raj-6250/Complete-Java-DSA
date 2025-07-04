import java.util.Arrays;

public class Sorting_Bubble {
    public static void main(String[] args) {
        int[] arr={15,20,10,40,05,8,21,88};
        Sorting(arr);
    }
    static void Sorting(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}

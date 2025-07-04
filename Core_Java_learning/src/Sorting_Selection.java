import java.util.Arrays;

public class Sorting_Selection {
    public static void main(String[] args) {
        int[] arr={34,23,54,21,9,32,3,43,6,21,0};
        SelectionSort(arr);

    }

    static void SelectionSort(int[] arr){
        for(int i=0;i<=arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

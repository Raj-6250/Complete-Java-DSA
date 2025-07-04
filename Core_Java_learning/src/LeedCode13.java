import java.util.Arrays;

public class LeedCode13 {
    public static void main(String[] args) {
        int[] arr={4,0,2,1};
        int term=missingTerm(arr);
        System.out.println(term);
    }
    static int missingTerm(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i];
            if(arr[i] <arr.length && arr[i] != arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else{
                i++;
            }
        }

        // Search for the first missing term.
        for(int j=0; j<arr.length; j++){
            if(arr[j] != j){
                return j;
            }
        }
        return arr.length;
    }
}

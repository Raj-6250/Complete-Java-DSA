import java.util.Scanner;
public class LinearSearch1 {
    public static void main(String[] args) {
//        Scanner n=new Scanner(System.in);
        int[] arr={10,45,34,89,45};
//        System.out.println("Enter target : " );
//        int target=n.nextInt();

//        int ans=LinearSearch( arr,34);
//        System.out.println(ans);
        System.out.println(LinearSearch( arr,90));
    }
    static int LinearSearch(int [] arr1, int target){
        if(arr1.length ==0){
            return -1;
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]==target){
                return i;
            }

        }
        return -1;
    }
}

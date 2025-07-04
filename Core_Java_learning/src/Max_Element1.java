public class Max_Element1 {
    public static void main(String[] args) {
        int[] arr={12,32,1,56,90};
        System.out.println(maxElement(arr));
    }
    static int maxElement(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}

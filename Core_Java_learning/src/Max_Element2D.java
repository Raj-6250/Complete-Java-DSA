public class Max_Element2D {
    public static void main(String args[]){
        int[][] arr={
                {34,78,76},
                {4,6,89,21,86},
                {34,67,54}
        };
        System.out.println(MaxElement(arr));
    }
    static int MaxElement(int[][] arr){
        int max=arr[0][0];
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]>max){
                    max=arr[row][col];
                }
            }
        }
        return max;
    }
}

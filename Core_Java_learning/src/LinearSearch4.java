import java.util.Arrays;

public class LinearSearch4 {
    public static void main(String[] args) {
        int[][] arr={
                {34,56,12},
                {23,52,45},
                {5,78,90}
        };
        int target=12;
        int[] ans=Searching2D(arr,target);// format to return value{row,col} 
        System.out.println(Arrays.toString(ans));
    }
    static int[] Searching2D(int[][] n,int target){
        if(n.length==0){
            return new int[]{-1,-1};
        }
        for(int i=0;i<n.length;i++){
            for(int j=1;j<n[i].length;j++){
                if(n[i][j]==target){
                    return new int[]{i,j};
                }

            }
        }
        return new int[]{-1,-1};
    }
}

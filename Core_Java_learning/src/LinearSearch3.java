public class LinearSearch3 {
    public static void main(String args[]){
        int[][] arr={
                {34,56,12},
                {23,52,45},
                {45,78,90}
        };
        int target=9;
        System.out.println(Searching2D(arr,target));
    }
    static boolean Searching2D(int[][] n,int target){
        if(n.length==0){
            return false;
        }
        for(int i=0;i<n.length;i++){
            for(int j=0;j<n[i].length;j++){
                if(n[i][j]==target){
                    return true;
                }

            }
        }
        return false;
    }
}

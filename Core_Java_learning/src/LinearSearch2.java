public class LinearSearch2 {
    public static void main (String args[]){
        String name="Bharat";
        char target='i';
        System.out.println(Searching(name,target));

    }
    static int Searching(String n,char target){
        if(n.length()==0){
            return -1;
        }
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)==target){
                return i;
            }
        }
        return -1;
    }
}

//find the next greatest letter or charcter and if the target is the last charcter of the array then print 1st charcter.
//doubt in this question.
public class LeedCode5 {
    public static void main(String[] args) {
        char[] letters={'c','f','j','k','n'};
        char target='n';
        System.out.println(nextGreatestLetter(letters,target));

    }
    static char nextGreatestLetter(char[] letters, char target){
        int start=0;
        int end= letters.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<letters[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return letters[start % letters.length];
    }
}

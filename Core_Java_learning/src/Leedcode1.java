//To find how many number are of even digit in an array.
//import java.math.*;
public class Leedcode1 {
    public static void main(String[] args) {
        int[] nums={12,345,32,62,7896};
        System.out.println(findNumbers(nums));
        System.out.println(digit(56785));
        System.out.println(digit2(-356788));
    }
    static int findNumbers(int[] nums){
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if(even(nums[i])){
                count++;
            }
        }
        return count;
    }
    static boolean even( int i){
        int numberofdigits=digit(i);
        if(numberofdigits%2==0){
            return true;
        }
        return false;
    }
    static int digit(int num){
        if(num<0){
            num=num*-1;
        }
        if(num==0){
            return 1;
        }
        int count =0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
    static int digit2(int num){
        if(num<0){
            num=num*-1;
        }
        return (int)(Math.log10(num))+1;
    }
}

public class reverseAnumber {
    public static void main(String[] args) {
        int n=3812;
        reverseNumber(n);
    }
    static void reverseNumber(int n){
        int ans=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            ans=ans*10+rem;
        }
        System.out.println(ans);
    }
}

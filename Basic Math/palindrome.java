//LEETCODE QUESTION
public class palindrome{
    public static boolean isPalindrome(int n){
        //neg no.s are NOT PALINDROME
        if(n<0){
            return false;
        }
        //No.s containing 0 at the end are NOT palindrome unless it is 0
        if(n%10==0 && n!=0){
            return false;
        }
        //COMPARE FIRST HALF OF NO. WITH SECOND HALF INSTEAD OF COMPARING WHOLE NO.
        int reversehalf=0;
        while(n>reversehalf){
            reversehalf=reversehalf*10+(n%10);
            n/=10;
        }
        return n==reversehalf || n==reversehalf/10;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(12121));
    }
}
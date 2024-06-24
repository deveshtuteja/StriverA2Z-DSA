
//LEETCODE QUES

public class reverse {
    public static int reverse_number(int x){
        int rev=0;
        while(x!=0){
            int ld=x%10;
            if(rev>Integer.MAX_VALUE/10 || (rev==Integer.MAX_VALUE/10 && ld>7)){
                return 0;
            }
            if(rev<Integer.MIN_VALUE/10 || (rev==Integer.MIN_VALUE/10 && ld<-8)){
                return 0;
            }
            rev=rev*10+ld;
            x/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.println(reverse_number(1234567899));
    }
}

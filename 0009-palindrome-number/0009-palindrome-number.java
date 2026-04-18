public class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0; int d; int temp = x;
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
        while(x > 0){
            d = x % 10;
            rev = rev * 10 + d;
            x = x/ 10;
        }
        return (temp == rev) ;
        
    }
}

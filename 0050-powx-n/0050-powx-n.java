public class Solution {
    public double myPow(double x, int n) {
        if (x == 0) {
            if (n <= 0) {
                throw new ArithmeticException("Undefined result: 0 raised to a non-positive power");
            }
            return 0;
        }
        
        if (n == 0) return 1;
        
        long longN = n;  // Convert n to long to handle overflow
        
        if (longN < 0) {
            x = 1 / x;
            longN = -longN;
        }
        
        double half = myPow(x, (int) (longN / 2));
        
        if (longN % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}

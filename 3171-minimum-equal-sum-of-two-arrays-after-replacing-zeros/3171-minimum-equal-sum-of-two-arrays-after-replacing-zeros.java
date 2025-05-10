class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long sum1 = 0, sum2 = 0;
        int zeroCount1 = 0, zeroCount2 = 0;
        
        for (int num : nums1) {
            sum1 += num;
            if (num == 0) zeroCount1++;
        }
        
        for (int num : nums2) {
            sum2 += num;
            if (num == 0) zeroCount2++;
        }
        
        boolean impossible = 
            (zeroCount1 == 0 && zeroCount2 != 0 && sum1 < sum2 + zeroCount2) ||
            (zeroCount2 == 0 && zeroCount1 != 0 && sum2 < sum1 + zeroCount1) ||
            (zeroCount1 == 0 && zeroCount2 == 0 && sum1 != sum2);
        
        if (impossible) return -1;
        
        return Math.max(sum1 + zeroCount1, sum2 + zeroCount2);
    }
}
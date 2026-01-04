class Solution {
    public int sumFourDivisors(int[] nums) {
        int totalSum = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int sum = 0;   
            int c = 0;     
            for (int j = 1; j*j <= nums[i]; j++) {
                if (nums[i] % j == 0) {
                    int other = nums[i]/j;
                    if(j == other){
                    sum += j;
                    c++;
                }
                else{
                    sum +=j + other;
                    c+= 2;
                }
            }
            if(c >4) break;
        }
            totalSum += (c == 4) ? sum : 0; 
        }
        return totalSum;
    }
}

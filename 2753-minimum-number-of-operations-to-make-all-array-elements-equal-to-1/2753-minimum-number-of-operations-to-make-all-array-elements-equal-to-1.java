class Solution {
    public int minOperations(int[] nums) {
        int len = nums.length;
        int sabkagcd = nums[0];
        for (int i = 1; i < len; i++){
            sabkagcd = gcd(sabkagcd, nums [i]);
        }
        if(sabkagcd > 1) return -1;

        int count1 = 0;
        for(int x : nums){
            if(x == 1) count1++;
        }
        if(count1 > 0) { return len - count1; }

        int minLen  = Integer.MAX_VALUE;
        for (int i = 0; i < len; i++) {
            int currGcd = nums[i];
            for (int j = i + 1; j < len; j++) {
                currGcd = gcd(currGcd, nums[j]);
                if (currGcd == 1) {
                    minLen = Math.min(minLen, j - i + 1);
                    break;
                }
            }
        }
        return (minLen - 1) + (len - 1);
    }
    int gcd(int a,int b){
    while(b != 0){
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
    }
}


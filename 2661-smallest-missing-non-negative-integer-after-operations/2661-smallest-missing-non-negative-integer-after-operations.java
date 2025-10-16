class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int[] freq = new int[value];

        for (int num : nums) {
            int mod = ((num % value) + value) % value; 
            freq[mod]++;
        }
        int x = 0;
        while (true) {
            int mod = x % value;
            if (freq[mod] == 0) {
                return x;  
            }
            freq[mod]--;  
            x++;
        }
    }
}

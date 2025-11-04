import java.util.*;

class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        
        for (int i = 0; i <= n - k; i++) {
            Map<Integer, Integer> freq = new HashMap<>();
            for (int j = i; j < i + k; j++) {
                freq.put(nums[j], freq.getOrDefault(nums[j], 0) + 1);
            }
            
            int[][] arr = new int[freq.size()][2];
            int idx = 0;
            for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
                arr[idx][0] = e.getKey();
                arr[idx][1] = e.getValue();
                idx++;
            }
            
            Arrays.sort(arr, (a, b) -> {
                if (a[1] != b[1]) return b[1] - a[1];
                return b[0] - a[0];
            });
            
            int sum = 0;
            for (int j = 0; j < Math.min(x, arr.length); j++) {
                sum += arr[j][0] * arr[j][1];
            }
            
            ans[i] = sum;
        }
        return ans;
    }
}

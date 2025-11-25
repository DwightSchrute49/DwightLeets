class Solution {
    public int smallestRepunitDivByK(int K) {
        if (K % 2 == 0 || K % 5 == 0) return -1;
        List<String> eleven = new ArrayList<>();
        int remainder = 0;
        for (int length = 1; length <= K; length++) {
            remainder = (remainder * 10 + 1) % K;   
            eleven.add("1".repeat(length));         
            if (remainder == 0) return length;      
        }
        return -1;
    }
}

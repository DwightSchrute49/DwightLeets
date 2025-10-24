class Solution {
    public int nextBeautifulNumber(int n) {
        int num = n + 1;
        while (true) {
            if (isBalanced(num)) return num;
            num++;
        }
    }

    private boolean isBalanced(int num) {
        int[] count = new int[10];
        while (num > 0) {
            count[num % 10]++;
            num /= 10;
        }
        for (int d = 0; d <= 9; d++) {
            if (count[d] > 0 && count[d] != d) return false;
        }
        return true;
    }
}

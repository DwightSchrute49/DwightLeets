class Solution {
    public int totalMoney(int n) {
        int sum = 0, j = 1;
        while(n > 0){
        for (int i = 0; i < 7 && n > 0; i++){
            sum = sum + i + j;
            n--;
        }
        j++;
        }
        return sum;
    }
}
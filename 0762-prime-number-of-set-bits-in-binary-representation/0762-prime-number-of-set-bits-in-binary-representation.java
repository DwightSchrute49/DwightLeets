class Solution {
    public int countPrimeSetBits(int left, int right) {
        String bin = "";int count = 0; int sum = 0;
        for(int   i = left; i <= right; i++){
            bin = Integer.toBinaryString(i);
            for(int j = 0; j < bin.length(); j++){
                if(bin.charAt(j) == '1') count++;
            }
            if (count >= 2) {
                boolean isPrime = true;
                for (int k = 2; k * k <= count; k++) {
                    if (count % k == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    sum++;
                }
            }
            count = 0; 
        }
        return sum;
    }
}
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int l = arr.length;
        int sum = 0;
        for (int i =0; i < l; i++){
        for (int j = i; j < l; j+=2){
        for (int k =i; k <= j; k++){
        sum += arr[k];
        }
    }
        }
        return sum ;
    }
}
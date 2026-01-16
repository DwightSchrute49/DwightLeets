class Solution {
    public int hIndex(int[] citations) {
        int len = citations.length;
        Arrays.sort(citations);
        int h = 0;
        for(int i = len- 1; i >= 0; i--){
            int k = len -i;
            if(citations[i] >= k){
                h = k;
            }
            else{
                break;
            }
        }
        return h;
    }
}
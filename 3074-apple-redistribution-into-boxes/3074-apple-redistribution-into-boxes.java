class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int sum = 0;
        for(int i : apple){
            sum += i;
        }
        int sumtot = 0, box = 0;
        int len = capacity.length;
        for(int j = len-1; j >= 0; j--){
            sumtot += capacity[j];
            box++;
            if(sumtot >=  sum) break;
        }
        return box;
    }
}
class Solution {
    public int maxTwoEvents(int[][] events) {
        int len = events.length;
        int best [] = new int [len];
        int end [] = new int [len];
        Arrays.sort(events, (a,b) -> a[1] - b[1]);
        for(int i = 0; i < len; i ++){
            end[i] = events[i][1];
            best[i] = events[i][2];
            if(i > 0){
                best[i] = Math.max(best[i], best[i-1]);
            }
        }
        int ans = 0;
        for(int i =0; i < len; i ++){
            int start = events [i][0];
            int value = events [i][2];
            int idx = upperbound(end, start-1);
            int total = value;
            if(idx >= 0){
                total += best[idx];
            }
            ans = Math.max(ans,total);
        }
        return ans;
    }
    int upperbound(int arr [], int target){
        int l = 0, r = arr.length - 1, res = -1;
        while(l <= r){
            int mid = l + (r-l)/2;
            if(arr[mid] <= target){
                res = mid;
                l = mid + 1;
            }
            else {
                r = mid -1;
        }

        }
        return res;
    }
}

class Solution {
    public long maxHeight(long time, int workerTime){
        long left = 0;
        long right = (long)Math.sqrt(2*time/workerTime) + 1;
        while(left <= right){
            long mid = (left + right) /2 ;
            long cost = mid * workerTime*(mid + 1)/2;
            if(cost <= time){
                left  = mid +1;
            }
            else 
                right = mid-1;
        }
        return right;
    }
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        long left = 1;long right = (long)1e18; long ans = right;
        while(left <= right){
            long  mid = (left + right)/2;
            long reduced =  0;
            for(int t: workerTimes){
                reduced += maxHeight(mid,t);
                if(reduced >= mountainHeight) break;
            }
            if(reduced >= mountainHeight){
                ans = mid ;right = mid - 1;
            }
            else { left = mid + 1 ;}
        }
        return ans;
    }
}
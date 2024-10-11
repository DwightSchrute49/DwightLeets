class Solution {
    public int numSquares(int n) {
      int arr[]=new int[n+1];
      Arrays.fill(arr,Integer.MAX_VALUE);
      arr[0]=0;
      int c=1;
      while(c*c<=n){
        int sq=c*c;
        for(int i=sq;i<=n;i++){
            arr[i]=Math.min(arr[i-sq]+ 1,arr[i]);
        }
        c++;
      }
      return arr[n]; 
    }
}
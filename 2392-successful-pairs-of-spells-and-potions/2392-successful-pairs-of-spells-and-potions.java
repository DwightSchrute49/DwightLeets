class Solution{
    public int[] successfulPairs(int[] spells,int[] potions,long success){
        Arrays.sort(potions);
        int[] ans=new int[spells.length];
        int n=potions.length;
        for(int i=0;i<spells.length;i++){
            int left=0,right=n-1,first=n;
            while(left<=right){
                int mid=(left+right)/2;
                long prod=(long)spells[i]*potions[mid];
                if(prod>=success){
                    first=mid;
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }
            ans[i]=n-first;
        }
        return ans;
    }
}

class Solution {
    public int countPalindromicSubsequence(String s) {
        int n=s.length();
        int cnt=0;
        int[] left=new int[26];
        int[] right=new int[26];
        int[] arr=new int[26]; 
        
        Arrays.fill(left, Integer.MAX_VALUE); 
        Arrays.fill(right, Integer.MIN_VALUE);
        for(int i=0; i<n; i++){
            int idx=s.charAt(i)-'a';
            left[idx]  = Math.min(left[idx], i);
            right[idx] = Math.max(right[idx],i);
            arr[idx]++;
        }       
        for(int i=0; i<26; i++){
            if(arr[i]==0) continue; 
            
            int cntChk=0;
            int[] arrChar=new int[26];      
            for(int j=left[i]+1; j<right[i]; j++){ 
                int idx=s.charAt(j)-'a';        
          
                if(arrChar[idx]==1 || i==idx ) continue;
                if(cntChk==25) break;                       
                
                arrChar[idx]=1;                    
                cntChk++;                
            }
            cnt+=cntChk;
        }      
        for(int i=0; i<26; i++){
           if(arr[i]>=3) cnt++;
        }

        return cnt;
    }
}
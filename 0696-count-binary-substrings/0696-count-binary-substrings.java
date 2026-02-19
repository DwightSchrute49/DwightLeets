class Solution {
    public int countBinarySubstrings(String s) {
        int prev = 0; int curr = 1; int count  = 0;
        int len = s.length();
        for(int i = 1; i  < len; i++){
            if(s.charAt(i) == s.charAt(i-1)){ curr ++ ;}
            else { count += Math.min(curr, prev );
                prev = curr;
                curr =1;
            }
        }
        count += Math.min(curr, prev);
        return count;
        
    }
}
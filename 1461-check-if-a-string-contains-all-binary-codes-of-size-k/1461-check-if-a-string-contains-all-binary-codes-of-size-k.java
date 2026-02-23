class Solution {
    public boolean hasAllCodes(String s, int k) {
       int len  = s.length();
       String sub = "";
       //if(len > 1 && k == 1) return true;
       int needed = 1 << k;
       Set<String> seen = new HashSet <>();
       for(int i = 0; i <= len- k; i++){
        sub = s.substring(i,i+k);
        seen.add(sub);
       } 
       if(seen.size() == needed){
        return true;
       }
       return false;
    }
}
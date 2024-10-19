public class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] ss =s.toCharArray();
        char[] tt =t.toCharArray();
        int s_length=ss.length;
        int t_length=tt.length;
        if(s_length != t_length) 
        return false;
        char[]sm=new char[256];
        char[]tm=new char[256];
        for(int i=0; i<s_length; i++){
            char sc=ss[i];
            char tc=tt[i];
            if(sm[sc] == 0 && tm[tc] == 0){
                sm[sc] = tc;
                tm[tc] = sc;
            }else{
                if(sm[sc] != tc || tm[tc] != sc){
                    return false;
                }
            }
        }
        return true;
    }
}
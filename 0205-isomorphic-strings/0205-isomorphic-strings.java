public class Solution {
    public boolean isIsomorphic(String sString, String tString) {
        char[] s = sString.toCharArray();
        char[] t = tString.toCharArray();
        int s_length=s.length;
        int t_length=t.length;
        if(s_length != t_length) 
        return false;
        char[]sm=new char[256];
        char[]tm=new char[256];
        for(int i=0; i<s_length; i++){
            char sc=s[i];
            char tc=t[i];
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
class Solution {
    public boolean isCircularSentence(String sentence) {
        sentence+=" ";
        int len=sentence.length();
        char c;
        if(sentence.charAt(0)!=sentence.charAt(len-2)){
            return false;
        }
        for(int i=1;i<len-1;i++){
            c=sentence.charAt(i);
            if(c==' ')
            {
                if(i>0 && i<(len-1) && sentence.charAt(i-1)!=sentence.charAt(i+1)){
            return false;
            }
        }
    }
    return true;
    }
}

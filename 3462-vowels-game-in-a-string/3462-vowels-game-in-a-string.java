class Solution {
    public boolean doesAliceWin(String s) {
       int count = 0;
       for(char c : s.toCharArray()){
        if(isVowel(c)){ count++;}
       }
        return count > 0;
       }
        boolean isVowel(char c){
        c = Character.toLowerCase(c);
        return (c == 'a' || c == 'e' || c == 'o' || c=='i' || c=='u');
       }

}

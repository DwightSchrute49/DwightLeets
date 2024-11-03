class Solution {
    public boolean rotateString(String s, String goal) {
        String abc=s+s;
        int len=s.length();
        int len2=goal.length();
        if(len==len2 && abc.contains(goal)){
        return true;
        }
        return false;
    }
}
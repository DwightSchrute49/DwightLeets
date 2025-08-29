class Solution {
    public int minOperations(String[] logs) {
        int counter = 0;
        for (String word : logs){
            if (!word.equals ("../") && !word.equals("./")) counter ++;
            else if(word.equals("../") && counter > 0) counter --;
            else counter += 0;
        }
        return counter;
    }
}
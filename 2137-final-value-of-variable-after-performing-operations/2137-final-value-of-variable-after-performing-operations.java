class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int value = 0;
        for (String x : operations){
            char first = x.charAt(0);
            char last = x.charAt(2);
            if (first == '+' || last == '+')
            { 
                value ++;
            }
            else{ value --; }
        }
        return value;
    }
}
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drank = numBottles;
        int newB;
        int empty = numBottles;
        while (empty >=  numExchange){
            
            newB   =  empty / numExchange;
            drank += newB; 
             empty = empty % numExchange + newB;
        }
    return drank;
    }
}
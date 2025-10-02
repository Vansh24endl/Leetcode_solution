class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int drunk = numBottles;
        int empty = numBottles;
        int exchangeRate = numExchange;
        
        while (empty >= exchangeRate) {
            empty -= exchangeRate;
            exchangeRate++;
            drunk++;
            empty++;
        }
        
        return drunk;
    }
}

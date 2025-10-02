class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int maxbottle=numBottles;
        int emptybottle=numBottles;

        while(emptybottle>=numExchange){
            emptybottle-=numExchange-1;
            maxbottle++;
            numExchange++;

        }
        return maxbottle;
    }
}
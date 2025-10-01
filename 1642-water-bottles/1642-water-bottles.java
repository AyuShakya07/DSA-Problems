class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        // int maxbottle=numBottles;
        // int emptybottle=numBottles;

        // while(emptybottle>=numExchange){
        //     int x=emptybottle/numExchange;
        //     maxbottle+=x;
        //     emptybottle=x+emptybottle%numExchange;
        // }
        // return maxbottle;

        return numBottles+(numBottles-1)/(numExchange-1);
    }
}
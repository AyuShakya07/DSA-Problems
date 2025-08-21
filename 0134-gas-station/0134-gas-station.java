class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int sumgas=0;
        int sumcost=0;
        for(int i=0; i<n; i++){
            sumgas += gas[i];
            sumcost += cost[i];
        }
        if(sumgas < sumcost) return -1;

        int totalgas=0;
        int res=0;
        for(int i=0; i<n; i++){
            totalgas += gas[i];
            if(totalgas >= cost[i]){
                totalgas -= cost[i];
            }
            else{
                res=i+1;
                totalgas=0;
            }
        }
        return res;
    }
}
class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int match=0;
        int n=players.length-1;
        int m=trainers.length-1;
        Arrays.sort(players);
        Arrays.sort(trainers);
        while(n>=0 && m>=0){
            if(trainers[m]>=players[n]){
                match++;
                m--;
            }
            n--;
        }
        return match;
    }
}
class Solution {
    public boolean winnerOfGame(String colors) {
        int n=colors.length();
        if(n<3) return false;
        int alice=0;
        int bob=0;

        for(int i=1; i<n-1; i++){
            char left=colors.charAt(i-1);
            char btw=colors.charAt(i);
            char right=colors.charAt(i+1);

            if(left=='A' && btw=='A' && right=='A') alice++;
            if(left=='B' && btw=='B' && right=='B') bob++;
        }
        if(alice > bob) return true;
        return false;
    }
}
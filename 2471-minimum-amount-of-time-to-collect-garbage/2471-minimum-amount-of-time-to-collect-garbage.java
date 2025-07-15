class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int M=0;
        int P=0;
        int G=0;
        int i=travel.length-1;
        for(int j=garbage.length-1; j>=0; j--){
            for(char c:garbage[j].toCharArray()){
                if(c=='M') M++;
                else if(c=='P') P++;
                else G++;
            }
            if(i>-1){
                int t=travel[i];
                if(M>0) M+=t;
                if(P>0) P+=t;
                if(G>0) G+=t;
            }
            i--;
        }
        return M+P+G;
    }
}
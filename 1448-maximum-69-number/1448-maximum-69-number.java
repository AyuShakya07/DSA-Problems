class Solution {
    public int maximum69Number (int num) {
        int[] digit=new int[4];
        int i=4;
        while(num>0){
            i--;
            digit[i]=num%10;
            num/=10;
        }
        for(int j=i; j<4; j++){
            if(digit[j]==6){
                digit[j]=9;
                break;
            }
        }
        for(int j=0; j<4; j++){
            num+=digit[j];
            num*=10;
        }
        return num/10;
    }
}
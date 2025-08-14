class Solution {
    public String largestGoodInteger(String num) {
        // int n=num.length();
        // StringBuilder ans=new StringBuilder();
        // char max='0';
        // boolean flag=false;
        // for(int i=1; i<n-1; i++){
        //     char c=num.charAt(i);
        //     if(c==num.charAt(i-1) && c==num.charAt(i+1)){
        //         if(c>max) max=c;
        //         flag=true;
        //     }
        // }
        // if(flag){
        //     ans.append(max);
        //     ans.append(max);
        //     ans.append(max);
        // }
        // return ans.toString();

        String[] sub={"000","111","222","333","444","555","666","777","888","999"};
        for(int i=9; i>=0; i--){
            if(num.contains(sub[i])) return sub[i];
        }
        return "";
    }
}
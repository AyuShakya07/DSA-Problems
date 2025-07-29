class Solution {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int st=0;
        int en=s.length()-1;
        while(st<en){
            if(isvowel(arr[st]) && isvowel(arr[en])){
                swap(arr,st,en);
                en--;
                st++;
            }
            if(!isvowel(arr[st])) st++;
            if(!isvowel(arr[en])) en--;
        }
        StringBuilder ans=new StringBuilder();
        for(char c:arr){
            ans.append(c);
        }
        return ans.toString();
    }
    private boolean isvowel(char c){
        return "aeiouAEIOU".indexOf(c) != -1;
    }
    private void swap(char[] arr, int s, int l){
        char temp=arr[s];
        arr[s]=arr[l];
        arr[l]=temp;
    }
}
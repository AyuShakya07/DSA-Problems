class Solution {
    public List<String> stringSequence(String target) {
        List<String> ans=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        for(char c: target.toCharArray()){
            sb.append('a');
            int n=sb.length();
            for(int i=98; i<=123; i++){
                if(sb.charAt(n-1)==c){
                    ans.add(sb.toString());
                    break;
                }else{
                    ans.add(sb.toString());
                    sb.setCharAt(n-1,(char)i);
                }
            }
        }
        return ans;
    }
}
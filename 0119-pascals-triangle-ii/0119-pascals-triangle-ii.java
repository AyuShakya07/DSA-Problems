class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans =new ArrayList<>();

        for(int i=1; i<=rowIndex+1; i++){
            List<Integer> temp=new ArrayList<>();
            for(int j=0; j<i; j++){
                if(j==0 || j==i-1){
                    temp.add(1);
                }
                else{
                    temp.add(ans.get(i-2).get(j)+ans.get(i-2).get(j-1));
                }
            }
            ans.add(temp);
        }
        return ans.get(rowIndex);
    }
}
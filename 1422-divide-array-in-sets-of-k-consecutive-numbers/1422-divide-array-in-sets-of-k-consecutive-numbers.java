class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        int n=nums.length;
        if(n%k != 0) return false;
        
        Map<Integer, Integer> mp=new HashMap<>();

        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        Integer[] keys = mp.keySet().toArray(new Integer[0]);
        Arrays.sort(keys);

        for(int i=0; i<keys.length; ){
            int x=mp.get(keys[i]);
            mp.put(keys[i],x-1);
            if(x>0){
                for(int j=keys[i]+1; j<keys[i]+k; j++){
                    if(mp.containsKey(j)){
                        int v=mp.get(j);
                        if(v<=0) return false;
                        else mp.put(j,v-1);
                    }else return false;
                }
            }else i++;
        }
        return true;
    }
}
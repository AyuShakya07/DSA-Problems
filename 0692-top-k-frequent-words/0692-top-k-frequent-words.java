class Solution {
    class Pair{
        String key;
        int val;
        public Pair(String key, int val){
            this.key=key;
            this.val=val;
        }
    }
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> mp=new HashMap<>();

        for(String s:words){
            mp.put(s,mp.getOrDefault(s,0)+1);
        }
        List<Pair> list=new ArrayList<>();
        for(Map.Entry<String,Integer> m : mp.entrySet()){
            list.add(new Pair(m.getKey(),m.getValue()));
        }
        list.sort((a,b) ->{
            if(a.val != b.val) return b.val - a.val;
            return a.key.compareTo(b.key);
        });

        List<String> ans=new ArrayList<>();
        for(Pair p:list){
            if(k==0) break;
            ans.add(p.key);
            k--;
        }
        return ans;
    }
}
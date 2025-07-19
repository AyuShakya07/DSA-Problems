class Solution {
    public List<String> removeSubfolders(String[] folder) {
        // List<String> res=new ArrayList<>();
        // Arrays.sort(folder);
        // res.add(folder[0]);
        // for(String s:folder){
        //     String[] ar1=res.get(res.size()-1).split("/");
        //     String[] ar2=s.split("/");
        //     if(ar1.length<=ar2.length){
        //         boolean flag=true;
        //         for(int i=0; i<ar1.length; i++){
        //             if(!ar1[i].equals(ar2[i])) flag=false;
        //         }
        //         if(!flag) res.add(s);
        //     }else res.add(s);
        // }
        // return res;


        Arrays.sort(folder);
        List<String> res=new ArrayList<>();
        res.add(folder[0]);
        for(int i=1; i<folder.length; i++){
            if(!folder[i].startsWith(res.get(res.size()-1)+"/")){
                res.add(folder[i]);
            }
        }
        return res;
    }
}
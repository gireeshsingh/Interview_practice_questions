class Solution {
    public List<String> commonChars(String[] A) {
        List<String> res = new ArrayList<String>();
        
        for(String str: A[0].split("")){
            int i=1;
            for(i=1; i<A.length; i++){
                if(A[i].contains(str)) A[i]=A[i].replaceFirst(str, "");
                else break;
            }
            if(i==A.length) res.add(str);
        }
        return res;
    }
}
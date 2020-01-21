class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        HashMap<Integer, List<String>> map=new HashMap<Integer, List<String>>();
        List<List<String>> ans=new ArrayList();
        for(String str: strings){
            int key=1;
            for(int i=0; i<str.length()-1; i++){
                int diff= str.charAt(i)-str.charAt(i+1);
                if(diff<0) diff=diff+26;
                key*=100;
                key+=diff;
            }
            List<String> temp = map.getOrDefault( key, new ArrayList<String>());
            temp.add(str);
            map.put(key, temp);
        }
        return new ArrayList<>(map.values());
    }
}
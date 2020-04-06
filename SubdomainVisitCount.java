class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        List<String> list = new ArrayList();
        for(String str: cpdomains){
            String[] parts = str.split(" ");
            int count = Integer.parseInt(parts[0]);
            String[] domains = parts[1].split("\\.");
            String curr="";
            for(int i=domains.length-1; i>=0; i--){
                curr=domains[i]+curr;
                map.put(curr, map.getOrDefault(curr, 0)+count);
                curr="."+curr;
            }
        }
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            list.add(entry.getValue()+" "+entry.getKey());
        }
        return list;
    }
}
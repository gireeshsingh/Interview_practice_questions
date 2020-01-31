/**
 * // This is the HtmlParser's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface HtmlParser {
 *     public List<String> getUrls(String url) {}
 * }
 */
class Solution {
    public List<String> crawl(String startUrl, HtmlParser htmlParser) {
        
        ArrayList<String> result = new ArrayList();
        result.add(startUrl);
        
        String[] split=startUrl.split("[/]+",3);
        String domainName=split[1];
        
        HashSet<String> set=new HashSet();
        set.add(startUrl);
        HashSet<String> banned = new HashSet();
        
        boolean newFound=false;
        int i=0;
        do{
            newFound=false;
            for(i=0;i<result.size();i++){
                String str=result.get(i);
                if(str.contains(domainName) && !banned.contains(str)){
                    HashSet<String> temp=new HashSet(htmlParser.getUrls(str));
                    Iterator<String> it = temp.iterator();
                    while(it.hasNext()){
                        String tt=it.next();
                        if(tt.contains(domainName)) {
                            set.add(tt);
                            banned.add(str);
                            newFound=true;
                        }
                    }
                }
            }
            result=new ArrayList(set);
        }while(newFound);
        
        return result;
    }
}
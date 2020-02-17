public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        if(strs.size()==0) return new String();
        String encStr="";
        for(String s: strs){
            if(s.equals(""))s="%2!";
            encStr+=s+"~.t,~";
        } 
        return encStr;
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        if(s.length()==0) return new ArrayList<String>();
        List<String> decStr = new ArrayList();
        for(String str: s.split("~.t,~")){
            if(str.equals("%2!")) str="";
            decStr.add(str);
        } 
        return decStr;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));
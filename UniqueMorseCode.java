class UniqueMorseCode {
    public int uniqueMorseRepresentations(String[] words) {
        String[] arr = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> hs=new HashSet<String>();
        int ascii;
        String[] result= new String[words.length];
        int i=0;
        for(i=0;i<words.length; i++){
            StringBuffer sb=new StringBuffer();
            for(char j: words[i].toCharArray()){
                ascii=j-'a';
                sb.append(arr[ascii]);
            }
            hs.add(sb.toString());
        }
        return hs.size();
    }
}
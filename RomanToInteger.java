class RomanToInteger {
    public int romanToInt(String s) {
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);

        char[] ch = s.toCharArray();
        int length = ch.length;
        int result = 0;
        for(int i = 0;i<length;i++){
                if(i != length-1 && hm.get(ch[i])<hm.get(ch[i+1])){
                    result = result + hm.get(ch[i+1]) - hm.get(ch[i]);
                    i++;
                }
                else
                    result += hm.get(ch[i]);      
        }

        return result;
    }
}
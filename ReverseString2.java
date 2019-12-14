class ReverseString2 {
    public String reverseStr(String s, int k) {
        char[] sChar=s.toCharArray();
        int i=0;
        while(i<sChar.length){
            if((i+k)<=sChar.length){
                char[] temp=rev(s.substring(i,i+k).toCharArray());
                for(int j=0;j<temp.length;j++)
                    sChar[i+j]=temp[j];
                i=i+2*k;
            }
            else{
                char[] temp=rev(s.substring(i).toCharArray());
                for(int j=0;j<temp.length;j++)
                    sChar[i+j]=temp[j];
                break;
            }
        }
        return new String(sChar);
    }
    
    public char[] rev(char[] s){
        for(int i=0; i<(s.length/2); i++){
            char temp=s[i];
            s[i]=s[(s.length-1)-i];
            s[(s.length-1)-i]=temp;
        }
        return s;
    }
}
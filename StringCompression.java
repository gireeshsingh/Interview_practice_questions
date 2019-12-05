class StringCompression {
    public int compress(char[] chars) {
        if(chars.length==0 || chars.length==1) return 1;
        int count=0,start=0,compress=0;
        int i=1;
        for(i=1;i<chars.length;i++){
            if(chars[i]==chars[i-1]){
                if(count==0){start=i;}count++;
            }
            else if(chars[i]!=chars[i-1]){
                chars[compress++]=chars[start++];
                if(++count>1){
                    String str=Integer.toString(count);
                    int j=0;
                    while(j<str.length()){
                        chars[compress++]=str.charAt(j++);
                    }
                } 
                start=i;
                count=0;
            }
        }
        
        chars[compress++]=chars[i-1];
        if(++count>1){
            String str=Integer.toString(count);
            int j=0;
            while(j<str.length()){
                chars[compress++]=str.charAt(j++);
            }
        }
        
        return compress;
    }
}
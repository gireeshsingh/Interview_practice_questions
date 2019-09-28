class BinaryGap {
    public int binaryGap(int N) {
        StringBuffer sb=new StringBuffer();
        while(N!=0){
            sb.append(N%2);
            N=N/2;
        }
        String bin=sb.toString();
        int i=0, start=Integer.MIN_VALUE, res=0;
        for(String str: bin.split("")){
            if(str.equals("1")){
                if(start!=Integer.MIN_VALUE) res=Math.max(res,i-start);
                start=i;
            }
            i++;
        }
        return res;
    }
}
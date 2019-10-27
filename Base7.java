class Base7 {
    public String convertToBase7(int num) {
        if(num==0) return "0";
        StringBuilder sb=new StringBuilder();
        int sign=1;
        if(num<0) sign=-1;
        num=Math.abs(num);
        while(num!=0){
            sb.append(num%7);
            num/=7;
        }
        if(sign==-1) return sb.append("-").reverse().toString();
        return sb.reverse().toString();
    }
}
class AddStrings {
    public String addStrings(String num1, String num2) {
        int l1=num1.length()-1, l2=num2.length()-1;
        if(l1<l2){
            String temp=num1; num1=num2; num2=temp; int t=l1;l1=l2;l2=t;
        }
        String[] a=num1.split(""), b=num2.split("");
        int carry=0, temp=0;
        StringBuffer sb=new StringBuffer();
        while(l1>=0){
            temp=Integer.parseInt(a[l1])+carry;
            if(l2>=0) temp+=Integer.parseInt(b[l2]);
            if(temp<10){
                carry=0;
                sb.append(Integer.toString(temp));
            }
            else{
                carry=temp/10;
                sb.append(Integer.toString(temp%10));
            }
            l2--; l1--;
        }
        if(carry>0) sb.append(carry);
        return sb.reverse().toString();
    }
}
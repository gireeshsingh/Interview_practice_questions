class AddBinary {
    public String addBinary(String a, String b) {
        if(a.length()<b.length()){
            String temp = a;
            a = b;
            b = temp;
        }
        String[] aArr = a.split("");
        String[] bArr = aArr.clone();
        int i=0;
        for(i=0;i<a.length()-b.length();i++) bArr[i]="0";
        for(String kk : b.split("")) bArr[i++] = kk;
        int carry=0;
        for(i=a.length()-1;i>=0;i--){
            int temp=Integer.parseInt(aArr[i])+Integer.parseInt(bArr[i])+carry;
            carry=0;
            aArr[i]=Integer.toString(temp);
            if(temp>=2) {carry=1; aArr[i]=Integer.toString(temp%2);}
        }
        return (carry==1?"1":"") + String.join("", aArr);
    }
}
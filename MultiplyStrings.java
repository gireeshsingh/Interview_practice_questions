class MultiplyStrings {
    public String multiply(String num1, String num2) {
        if( num1.length()==0 || num2.length()==0 ) return "0";
        if(num1.length()==1){
            if(num1.equals("0")) return "0"; 
            if(num1.equals("1")) return num2;
        }
        if(num2.length()==1){
            if(num2.equals("0")) return "0";
            if(num2.equals("1")) return num1;
        }
        if(num1.length()<num2.length()){
            String temp=num1; num1=num2; num2=temp;
        }
        
        int len1=num1.length(), len2=num2.length(), totallen=len1+len2;
        int[] result=new int[totallen], arr1 = new int[totallen], arr2= new int[totallen];
        int[][] mid=new int[len2][totallen];
        
        int i=totallen-len1;
        for(String str: num1.split("")){
            arr1[i]=Integer.parseInt(str); i++;
        }
        i=totallen-len2;
        for(String str: num2.split("")){
            arr2[i]=Integer.parseInt(str); i++;
        }
        int carry=0, j=0, temp=0;
        for(i=len2-1;i>=0;i--){
            carry=0;
            for(j=totallen-1;j>=0;j--){
                temp=carry+arr1[j]*arr2[i+len1];
                mid[i][j]=temp;
                carry=0;
                if(temp>9){
                    mid[i][j]=temp%10;
                    carry=temp/10;
                }
            }
            int k=(len2-1)-i;
            for(j=0;j<totallen-k;j++){
                mid[i][j]=mid[i][j+k];
            }
            while(j<totallen) mid[i][j++]=0;
        }

        carry=0;
        for(j=totallen-1;j>=0;j--){
            temp=0;
            for(i=0;i<len2;i++) temp=temp+result[j]+mid[i][j];
            temp=temp+carry;
            result[j]=temp;
            carry=0;
            if(temp>9){
                carry=temp/10; result[j]=temp%10;
            }
        }       
        i=0;
        while(result[i]==0) i++;
        String[] strArray = Arrays.stream(Arrays.copyOfRange(result, i, totallen))
								.mapToObj(String::valueOf)
								.toArray(String[]::new);
        return String.join("", strArray);
    }
}
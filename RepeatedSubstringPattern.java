class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int num=s.length();
        int i=num/2;
        while(i>0){
            if(num%i==0){
                String temp=s;
                String str=s.substring(0, i);
                while(temp.length()!=0 && temp.contains(str) ){
                    if(temp.substring(0,i).equals(str)) temp=temp.substring(i);
                    else break;
                }
                if(temp.length()==0) return true;
            }
            i--;
        }
        return false;
    }
}
class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        StringBuilder ans=new StringBuilder();
        while(n>0){
            ans.append((char)(--n%26+65));
            n/=26;
        }
        return ans.reverse().toString();
    }
}
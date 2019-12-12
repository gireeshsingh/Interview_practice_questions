class ValidPallindrome {
    public boolean isPalindrome(String s) {
        if(s==null || s.length()==0 || s.length()==1) return true;
        ArrayList<String> arr=new ArrayList<String>();
        for(int i=0; i <s.length() ; i++){
            if(s.substring(i,i+1).matches("[a-zA-Z0-9]+")){
                arr.add(s.substring(i,i+1));
            }
        }
        System.out.println(arr.toString());
        for(int i=0;i<arr.size()/2;i++){
            if(!arr.get(i).equalsIgnoreCase(arr.get(arr.size()-(i+1)))){
                return false;
            }
        }
        return true;
    }
}
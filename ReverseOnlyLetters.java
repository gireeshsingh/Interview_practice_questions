class ReverseOnlyLetters {
    public String reverseOnlyLetters(String S) {
        String[] arr=S.split("");
        int start=0, end=arr.length-1;
        while(start<end){
            while(start<end && !arr[start].matches("[a-zA-Z]+")) start++;
            while(start<end && !arr[end].matches("[a-zA-Z]+")) end--;
            if(start<end){
                String temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++; end--;
            }
        }
        return String.join("",arr);
    }
}
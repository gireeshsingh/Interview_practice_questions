class RemoveAdjacentDuplicates2 {
    public String removeDuplicates(String s, int k) {
        int index=1, count=1, temp=0,counter=0;
        StringBuilder sb=new StringBuilder(s);
        while(index<sb.length()){
            if(sb.charAt(index)==sb.charAt(index-1)){
                count++;
                if(count==k){
                    count=1;
                    temp=index-(k-1);
                    counter=k;
                    while(counter-->0) sb.deleteCharAt(temp);
                    if(temp>k) index=temp-k;
                    else index=1;
                }
                else index++;
            }
            else{
                index++;
                count=1;
            }
        }
        return sb.toString();
    }
}
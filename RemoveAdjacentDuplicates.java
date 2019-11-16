class RemoveAdjacentDuplicates {
    public String removeDuplicates(String S) {
        StringBuilder sb=new StringBuilder(S);
        int index=1;
        while(index<sb.length()){
            if(sb.charAt(index-1)==sb.charAt(index)){
                sb.deleteCharAt(index-1);
                sb.deleteCharAt(index-1);
                if(index>1) index--;
            }
            else
                index++;
        }
        return sb.toString();
    }
}
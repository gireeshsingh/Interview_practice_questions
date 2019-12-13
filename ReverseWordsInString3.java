class ReverseWordsInString3 {
    public String reverseWords(String s) {
        String[] str=s.split("");
        int start=0;
        int i=0;
        for(i=0;i<str.length;i++){
            if(str[i].equals(" ")){
                List<String> tempList = new ArrayList<String>();
                tempList=Arrays.asList(Arrays.copyOfRange(str, start, i));
                Collections.reverse(tempList);
                String[] temp = tempList.toArray(new String[0]); 
                for(int j=start; j<i; j++){
                    str[j] = temp[j-start];
                }
                start=i+1;
            }
        }
        List<String> tempList = new ArrayList<String>();
        tempList=Arrays.asList(Arrays.copyOfRange(str, start, i));
        Collections.reverse(tempList);
        String[] temp = tempList.toArray(new String[0]); 
        for(int j=start; j<i; j++){
            str[j] = temp[j-start];
        }
        return String.join("",str);
    }
}
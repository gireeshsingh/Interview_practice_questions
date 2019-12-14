class ReverseVowelsOfString {
    public String reverseVowels(String s) {
        HashSet<String> hs=new HashSet<String>(Arrays.asList("a","e","i","o","u","A","E","I","O","U"));
        ArrayList<String> arr=new ArrayList<String>();
        for(String i: s.split("")){
            if(hs.contains(i)){
                arr.add(i);
            }
        }
        String[] sArr=s.split("");
        System.out.println(sArr);
        for(int j=0; j<sArr.length; j++){
            if(hs.contains(sArr[j])){
                sArr[j]=arr.get(arr.size()-1);
                arr.remove(arr.size()-1);
            }  
        }

        return String.join("", sArr);
    }
}
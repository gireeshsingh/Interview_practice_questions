class LetterTilePossibilities {
    public int numTilePossibilities(String tiles) {
        List<String> result = new ArrayList<String>();
        helper(result, tiles, "");
        return result.size();
    }
    public void helper(List<String> result, String tiles, String current){
        for(int i=0;i<tiles.length();i++){
            if(result.contains(current+tiles.charAt(i))) continue;
            result.add(current+tiles.charAt(i));
            helper(result, tiles.substring(0,i)+tiles.substring(i+1, tiles.length()), current+tiles.charAt(i));
        }
    }
}
class Solution {
    public boolean validWordSquare(List<String> words) {
        if (words == null || words.size() == 0) {
            return true;
        }
        for (int row = 0; row < words.size(); row++) {
            if (!words.get(row).equals(columnWord(words, row))) {
                return false;
            }
        }
        return true;
    }
    
    private String columnWord(List<String> words, int column) {
        StringBuffer sb = new StringBuffer();
        for (String word : words) {
            if (column < word.length()) {
                sb.append(word.charAt(column));
            }
        }
        return sb.toString();
    }
}
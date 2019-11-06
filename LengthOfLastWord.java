class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) return 0;
        int count = 0, end = s.length()-1;
        while(end >= 0 && s.charAt(end) ==  ' ') end--; // trim
        while (count <= end && s.charAt(end-count) != ' ') count++; // count
        return count;
    }
}
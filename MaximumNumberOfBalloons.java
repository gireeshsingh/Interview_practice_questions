class MaximumNumberOfBalloons {
    public int maxNumberOfBalloons(String text) {
        int[] count=new int[5];
        char[] cArr ={'b','a','l','o','n'};
        for(int i=0;i<5;i++)
            for(char c: text.toCharArray())
                if((char)(c^cArr[i])=='\u0000')
                    count[i]++;
        count[2]/=2;
        count[3]/=2;
        int min=Integer.MAX_VALUE;
        for(int i: count) min=Math.min(min,i);
        return min;
    }
}
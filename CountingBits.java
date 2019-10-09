class CountingBits {
    public int[] countBits(int num) {
        int[] result = new int[num + 1];
        int twos = 1;
        for(int i = 1; i < num + 1; i++) {
            if(i == (twos << 1)) twos = twos << 1;
            result[i] = 1 + result[i-twos];
        }
        return result;
    }
}
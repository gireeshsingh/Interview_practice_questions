class HammingDistance {

	public static void main(String args[]){
		HammingDistance s = new HammingDistance();
		System.out.println(s.hammingDistance(1,4));
	}

    public int hammingDistance(int x, int y) {
        int sum=0;
        while(x>0||y>0){
            sum+=x%2^y%2;
            x>>=1;
            y>>=1;
        }
        
        return sum;
    }
}
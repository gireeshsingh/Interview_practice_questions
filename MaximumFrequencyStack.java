class FreqStack {
    
    Map<Integer, Integer> f;
    Map<Integer, Stack<Integer>> map;
    int maxf;

    public FreqStack() {
        maxf=0;
        f=new HashMap();
        map=new HashMap();
    }
    
    public void push(int x) {
        int temp=f.getOrDefault(x,0)+1;
        f.put(x, temp);
        maxf=Math.max(maxf, temp);
        map.computeIfAbsent(temp, z->new Stack()).push(x);
    }
    
    public int pop() {
        int x=map.get(maxf).pop();
        f.put(x, f.get(x)-1);
        if(map.get(maxf).size()==0) maxf--;
        return x;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 */
class Solution {
    
    public int mctFromLeafValues(int[] arr) {
        int ans=0;
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(Integer.MAX_VALUE);
        
        for(int i: arr){
            while(stack.peek()<=i){
                int mid=stack.pop();
                ans+=mid*Math.min(i, stack.peek());
            }
            stack.push(i);
        }
        
        while(stack.size()>2){
            ans+=stack.pop()*stack.peek();
        }
        
        return ans;
    }

}
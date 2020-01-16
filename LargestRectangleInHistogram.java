class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea=0, area=0, i=0;
        Stack<Integer> stack = new Stack<Integer>();
        
        for(i=0;i<heights.length; ){
            if(stack.isEmpty() || heights[stack.peek()]<=heights[i])
                stack.push(i++);
            else {
                int top=stack.pop();
                if(stack.isEmpty()) area=heights[top]*i;
                else area=heights[top]*(i-stack.peek()-1);
                maxArea=Math.max(area, maxArea);
            }
        }
        
        while(!stack.isEmpty()){
            int top=stack.pop();
            if(stack.isEmpty()) area=heights[top]*i;
            else area=heights[top]*(i-stack.peek()-1);
            maxArea=Math.max(area, maxArea);
        }
        return maxArea;
    }
}
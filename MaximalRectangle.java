class Solution {
    public int maximalRectangle(char[][] matrix) {
        int result = 0, area=0;
        if(matrix.length==0) return 0;
        int[] heights = new int[matrix[0].length];
        for(int i=0; i<matrix.length; i++){
            for(int j=0;j<matrix[0].length; j++){
                if(matrix[i][j]=='0') heights[j]=0;
                else heights[j] +=Character.getNumericValue(matrix[i][j]);
            }
            result=Math.max(result,largestRectangleArea(heights));
        }
        
        return result;
    }
    
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
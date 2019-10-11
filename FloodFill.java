class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc]==newColor) return image;
        return helper(image, sr,sc, image[sr][sc], newColor);
    }
    
    public int[][] helper(int[][] image, int sr, int sc, int oldColor, int newColor){
        if(image[sr][sc]!=oldColor) return image;
        else{
            image[sr][sc]=newColor;
            if(sr<image.length-1) image=helper(image, sr+1, sc, oldColor, newColor);
            if(sc<image[0].length-1) image=helper(image, sr, sc+1, oldColor, newColor);
            if(sr>0) image=helper(image, sr-1, sc, oldColor, newColor);
            if(sc>0) image=helper(image, sr, sc-1, oldColor, newColor);
        }
        return image;
    }
}
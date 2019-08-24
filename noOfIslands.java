public class noOfIslands{
	
	public static void main(String args[]){
		int M[][] = new int[][] { { 1, 1, 0, 0, 0 }, 
                                  { 0, 1, 0, 0, 1 }, 
                                  { 1, 0, 0, 1, 1 }, 
                                  { 0, 0, 0, 0, 0 }, 
                                  { 1, 0, 1, 0, 1 } };
		int i,j;
		int limit=5;
		int count=0;
		
		for(i=0;i<limit;i++){
			for(j=0;j<limit;j++){
				if(M[i][j]==1){
					count+=dfs(M,limit,i,j);
				}
			}
		}
		
		System.out.println(count);
	}
	
	static int dfs(int[][] M, int limit,int i, int j){
		if( i>limit-1 || i<0 || j<0 || j>limit-1 || M[i][j]==0){
			return 0;
		}
		else{
			M[i][j]=0;
		}
		dfs(M,limit,i+1,j);
		dfs(M,limit,i,j+1);
		dfs(M,limit,i-1,j);
		dfs(M,limit,i,j-1);
		return 1;
	}
}
import java.io.*;
import java.util.*;

public class maxSquare{

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows=sc.nextInt();
		System.out.println("Enter the number of columns");
		int cols=sc.nextInt();
		int i,j;
		System.out.println("Enter the elements: ");
		int arr[][]=new int[rows][cols];
		for(i=0;i<rows;i++){
			for(j=0;j<cols;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Area of largest square containing all 1's is "+findMaxSquare(arr,rows,cols));
	}

	public static int findMaxSquare(int arr[][], int rows, int cols){
		int i,j,maxArea=0;
		int temp[][]=new int[rows][cols];

		for(i=0;i<cols;i++){
			temp[0][i]=arr[0][i];
		}
		for(i=0;i<rows;i++){
			temp[i][0]=arr[i][0];
		}

		for(i=1;i<rows;i++){
			for(j=1;j<cols;j++){
				if(arr[i][j]!=0){
					temp[i][j]=arr[i][j]+Math.min(Math.min(temp[i-1][j-1],temp[i-1][j]),temp[i][j-1]);
					if(maxArea<temp[i][j]){
						maxArea=temp[i][j];
					}
				}
				else{
					temp[i][j]=0;
				}
			}
		}

		return maxArea*maxArea;
	}

}
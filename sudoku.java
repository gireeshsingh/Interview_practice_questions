import java.io.*;
import java.util.*;

public class sudoku{
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[9][9];
		int i,j;
		System.out.println("Enter the Sudoku Puzzle:");
		for(i=0;i<9;i++){
			for(j=0;j<9;j++){
				arr[i][j]=Integer.parseInt(sc.next());
			}
		}
		sudoku sdk=new sudoku();
		sdk.solveSudoku(arr,0,0);
		sdk.printBoard(arr);
	}

	public boolean solveSudoku(int arr[][], int row, int col){
		int i,j,nrow,ncol;
		boolean valid=false;
		if(arr[row][col]!=0){
			if(col==8){
				row=row+1;
				col=0;
			}
			else if(col<8){
				col=col+1;
			}
			if(row==9){
				return true;
			}
			else{
				return solveSudoku(arr, row, col);
			}
		}
		else{
			for(i=0;i<9;i++){
				valid=checkValidity(arr, row, col, i+1);
				if(valid){
					arr[row][col]=i+1;
					if(col==8){
						nrow=row+1;
						ncol=0;
					}
					else{
						ncol=col+1;
						nrow=row;
					}

					if(nrow==9){
						return true;
					}
					else if(nrow<9){
						if(solveSudoku(arr, nrow, ncol)){
							return true;
						}
						else{
							arr[row][col]=0;
						}
					}
				}
			}
		}
		return false;
	}

	public boolean checkValidity(int arr[][], int row, int col, int val){
		int i,j;
		//row check
		for(i=0;i<9;i++){
			if(arr[row][i]==val){
				return false;
			}
		}
		//col check
		for(i=0;i<9;i++){
			if(arr[i][col]==val){
				return false;
			}
		}
		
		//3*3 box check
		int srow=row-row%3;
		int scol=col - col%3;
		for(i=srow;i<(srow+3);i++){
			for(j=scol;j<(scol+3);j++){
				if(arr[i][j]==val){
					return false;
				}
			}
		}

		return true;
	}

	public void printBoard(int arr[][]){
		int i,j;
		System.out.println("::::::::::::::::::::::::::");
		System.out.println("Solution to Sudoku Puzzle:");
		for(i=0;i<9;i++){
			for(j=0;j<9;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("::::::::::::::::::::::::::");
	}

}
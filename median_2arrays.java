import java.io.*;
import java.util.*;

public class median_2arrays{

	public static void main(String args[]){
		int i=0;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number of elements of 1st array:");
		int x=sc.nextInt();
		int arrX[]=new int[x];
		System.out.println("Enter elements of arrayX:");
		for(i=0;i<x;i++){
			arrX[i]=sc.nextInt();
		}
		
		System.out.println("Enter the number of elements of 2nd array:");
		int y=sc.nextInt();
		int arrY[]=new int[y];
		System.out.println("Enter elements of arrayY:");
		for(i=0;i<y;i++){
			arrY[i]=sc.nextInt();
		}

		if(x>y){
			int[] temp=arrX; arrX=arrY; arrY=temp;
			int tmp=x; x=y; y=tmp;
		}

		//handling edge cases
		if(arrX[0]>arrY[y-1]){
			if(x==y){
				System.out.println("Median of the two arrays is "+((float)arrY[y-1]+(float)arrX[0])/2);
				return;
			}
			else if((x+y)%2==1){
				System.out.println("Median of the two arrays is "+arrY[(x+y)/2]);
				return;
			}
			else if((x+y)%2==0){
				System.out.println("Median of the two arrays is "+((float)arrY[(x+y)/2] + (float)arrY[(x+y)/2-1])/2 );
				return;
			}
		}
		else if(arrY[0]>arrX[x-1]){
			if(x==y){
				System.out.println("Median of the two arrays is "+((float)arrX[x-1]+(float)arrY[0])/2);
				return;
			}
			else if((x+y)%2==1){
				System.out.println("Median of the two arrays is "+arrY[(x+y)/2-x]);
				return;
			}
			else if((x+y)%2==0){
				System.out.println("Median of the two arrays is "+((float)arrY[(x+y)/2-x] + (float)arrY[(x+y)/2-x-1])/2 );
				return;
			}
		}

		int start=0, end=x;
		int partitionX=(start+end)/2;
		int partitionY=(x+y+1)/2 - partitionX;

		while(!(arrX[partitionX-1]<=arrY[partitionY] && arrY[partitionY-1]<=arrX[partitionX])){
			if(arrX[partitionX-1]>arrY[partitionY]){
				partitionX=partitionX-1;
				partitionY=(x+y+1)/2 - partitionX;
			}
			else{
				partitionX=partitionX+1;
				partitionY=(x+y+1)/2 - partitionX;
			}
		}

		if((x+y)%2==1){
			System.out.println("Median of the two arrays is "+Math.max(arrX[partitionX-1],arrY[partitionY-1]));
			return;
		}
		else{
			System.out.println("Median of the two arrays is "+
				(Math.max(arrX[partitionX-1],arrY[partitionY-1])+Math.min(arrX[partitionX],arrY[partitionY]))/2);
			return;
		}
	}
}
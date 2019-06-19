import java.io.*;
import java.util.*;

public class sumexists{

	public static void main(String args[]){

		Scanner sc=new Scanner(System.in);
		int i,j;
		System.out.println("Enter the number of elements:");
		int n=sc.nextInt();
		System.out.println("Enter the elements:");
		Integer arr[]=new Integer[n];
		for(i=0;i<n;i++){
			arr[i]=Integer.parseInt(sc.next());
		}
		//Set<Integer> nset=new HashSet<>(Arrays.asList(arr));
		Set<Integer> nset = new HashSet<Integer>();
		System.out.println("Enter the sum:");
		int sum=sc.nextInt();
		int temp;
		for(i=0;i<n;i++){
			if(nset.contains(arr[i])){
				System.out.println("Found both elements");
				return;
			}
			else{
				temp=sum-arr[i];
				nset.add(temp);
			}
		}
		System.out.println("Combination not found");
	}

}
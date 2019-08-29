import java.io.*;
import java.util.*;

public class plusOne{
	
	public static void main(String args[]){
		plusOne p=new plusOne();
		p.plusOne(new int[]{9,9,9});
	}
	
	public int[] plusOne(int[] digits) {
		int len=digits.length;
		
		digits[len-1]+=1;
		int i=0,carry=digits[len-1]/10;
		digits[len-1]%=10;
		for(i=len-2;i>=0;i--){
			if(carry==0)
				break;
			else
				digits[i]+=carry;
			carry=digits[i]/10;
			digits[i]=digits[i]%10;
		}
		
		if(carry>0){
			int arr[]=new int[len+1];
			arr[0]=carry;
			for(i=1;i<=len;i++){
				arr[i]=digits[i-1];
			}
			System.out.println("array:"+Arrays.toString(arr));
		}
		System.out.println("carry:"+carry);
        System.out.println("array:"+Arrays.toString(digits));
		return digits;
    }

}
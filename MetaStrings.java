class MetaStrings 
{  
	static boolean areMetaStrings(String str1, String str2) 
	{ 
		int len1 = str1.length(); 
		int len2 = str2.length(); 
	
		if (len1 != len2) 
			return false; 
	
		int prev = -1, curr = -1; 
	
		int count = 0; 
		for (int i=0; i<len1; i++) 
		{ 
			if (str1.charAt(i) != str2.charAt(i)) 
			{ 

				count++; 
	
				if (count > 2) 
					return false; 
	
				prev = curr; 
				curr = i; 
			} 
		} 

		return (count == 2 && 
				str1.charAt(prev) == str2.charAt(curr) && 
				str1.charAt(curr) == str2.charAt(prev)); 
	} 

	public static void main(String args[]) 
	{ 
		String str1 = "converse"; 
		String str2 = "conserve"; 
	
		System.out.println(areMetaStrings(str1,str2) ? "Yes" :"No"); 
	} 
} 

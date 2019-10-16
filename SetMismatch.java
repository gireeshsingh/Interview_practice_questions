class SetMismatch {
    public int[] findErrorNums(int[] arr) {
        int[] result = new int[2];
		int[] temp = new int[arr.length + 1];
		for(int i = 0; i < arr.length; i++)	temp[arr[i]]++;
		for(int i = 1; i <= arr.length; i++)	{
			if(temp[i] == 2)result[0] = i;
			else if(temp[i] == 0)result[1] = i;
		}
		return result;
    }
}